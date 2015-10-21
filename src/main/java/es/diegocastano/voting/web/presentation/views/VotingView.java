package es.diegocastano.voting.web.presentation.views;

import es.diegocastano.voting.web.presentation.models.Model;

public class VotingView implements View {

	@Override
	public void show(Model model) {
		System.out.println("Voting Page");
		System.out.println("\tTemas: " + model.get("themes"));
	}

}
