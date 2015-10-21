package es.diegocastano.voting.rest.business.controllers;

import java.util.List;

import es.diegocastano.voting.rest.business.views.ThemeTransfer;
public class StartController {
	
	ShowVotingController showVotingController = new ShowVotingController();
	
	public List<ThemeTransfer> start() {
		return showVotingController.showVoting(); 
	}
}
