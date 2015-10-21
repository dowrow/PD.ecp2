package es.diegocastano.voting.web.presentation.presenters;

import es.diegocastano.voting.rest.business.controllers.StartController;
import es.diegocastano.voting.rest.business.controllers.VoteThemeController;
import es.diegocastano.voting.web.presentation.models.Model;

public class VotingPresenter {

	public String process(Model model) {
		StartController startController = new StartController();
		model.put("themes", startController.start());
		return "VotingView";
	}
	
	public String voteTheme(Model model, String themeName, int vote) {
		VoteThemeController voteThemeController = new VoteThemeController();
		model.put("themes", voteThemeController.voteTheme(themeName, vote));
		return "VotingView";
	}

}
