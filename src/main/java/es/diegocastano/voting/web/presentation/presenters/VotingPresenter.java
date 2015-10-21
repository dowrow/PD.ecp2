package es.diegocastano.voting.web.presentation.presenters;

import es.diegocastano.voting.rest.business.controllers.StartController;
import es.diegocastano.voting.web.presentation.models.Model;

public class VotingPresenter {

	public String process(Model model) {
		StartController startController = new StartController();
		model.put("themes", startController.start());
		return "VotingView";
	}

}
