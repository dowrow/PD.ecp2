package es.diegocastano.voting.web.presentation.presenters;

import es.diegocastano.voting.web.presentation.models.Model;

public class VotingPresenter {

	public String process(Model model) {
		model.put("themes", "[]");
		return "VotingView";
	}

}
