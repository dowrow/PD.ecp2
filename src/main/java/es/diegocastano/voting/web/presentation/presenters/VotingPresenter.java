package es.diegocastano.voting.web.presentation.presenters;

import java.util.Map;

import es.diegocastano.voting.rest.business.controllers.StartController;
import es.diegocastano.voting.rest.business.controllers.VoteThemeController;
import es.diegocastano.voting.web.presentation.models.Model;

public class VotingPresenter {

	private String themeName;
	private int vote;
	
	public String start(Model model) {
		StartController startController = new StartController();
		model.put("themes", startController.start());
		return "VotingView";
	}
	
	public String voteTheme(Model model) {
		VoteThemeController voteThemeController = new VoteThemeController();
		model.put("themes", voteThemeController.voteTheme(themeName, vote));
		return "VotingView";
	}

	public void setters(Map<String, String> params) {
		themeName = params.get("themeName");
		vote = Integer.parseInt(params.get("value"));
	}

}
