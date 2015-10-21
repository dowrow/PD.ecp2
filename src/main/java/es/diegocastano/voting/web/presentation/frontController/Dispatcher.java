package es.diegocastano.voting.web.presentation.frontController;

import es.diegocastano.voting.web.http.HttpRequest;
import es.diegocastano.voting.web.http.HttpResponse;
import es.diegocastano.voting.web.presentation.models.Model;
import es.diegocastano.voting.web.presentation.presenters.ThemeManagerPresenter;
import es.diegocastano.voting.web.presentation.presenters.VotingPresenter;
import es.diegocastano.voting.web.presentation.views.ErrorView;
import es.diegocastano.voting.web.presentation.views.ThemeManagerView;
import es.diegocastano.voting.web.presentation.views.View;
import es.diegocastano.voting.web.presentation.views.VotingView;

public class Dispatcher {

	public void doGet(HttpRequest request, HttpResponse response) {
		Model model = new Model();
		String presenter = request.getPath() + "Presenter";
		String nextView = request.getPath() + "View";

		switch (presenter) {
		case "VotingPresenter":
			VotingPresenter votingPresenter = new VotingPresenter();
			nextView = votingPresenter.process(model);
			break;
		case "ThemeManagerPresenter":
			ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
			nextView = themeManagerPresenter.process(model);
			break;
		}

		this.show(nextView, model);
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		
		Model model = new Model();
		String presenter = request.getPath() + "Presenter";
		String action = request.getParams().get("action");
		String nextView = request.getPath() + "View";

		switch (presenter) {
		case "ThemeManagerPresenter":
			ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();		
			if ("createTheme".equals(action)) {
				nextView = themeManagerPresenter.createTheme(model, request.getParams().get("themeName"));
			} else {
				model.put("error", "Acción no permitida: " + action);
			}
			break;
		case "VotingPresenter":
			VotingPresenter votingPresenter = new VotingPresenter();
			if ("voteTheme".equals(action)) {
				String themeName = request.getParams().get("themeName");
				int vote = Integer.parseInt(request.getParams().get("value"));
				nextView = votingPresenter.voteTheme(model, themeName, vote);
			}
		}
		
		this.show(nextView, model);
	}

	private void show(String nextView, Model model) {
		View view;
		switch (nextView) {
		case "VotingView":
			view = new VotingView();
			break;

		case "ThemeManagerView":
			view = new ThemeManagerView();
			break;

		default:
			view = new ErrorView();
			model.put("error", "Vista no encontrada: " + nextView);
		}
		view.show(model);
	}

}
