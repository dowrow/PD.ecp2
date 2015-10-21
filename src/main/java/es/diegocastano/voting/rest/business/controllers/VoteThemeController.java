package es.diegocastano.voting.rest.business.controllers;

import java.util.List;

import es.diegocastano.voting.rest.business.models.entities.Theme;
import es.diegocastano.voting.rest.business.models.entities.Vote;
import es.diegocastano.voting.rest.business.views.ThemeTransfer;
import es.diegocastano.voting.rest.data.models.daos.DaoFactory;
import es.diegocastano.voting.rest.data.models.daos.ThemeDao;
import es.diegocastano.voting.rest.data.models.daos.VoteDao;

public class VoteThemeController {

	ShowVotingController showVotingController = new ShowVotingController();

	public List<ThemeTransfer> voteTheme(String themeName, int vote) {
		VoteDao voteDao = DaoFactory.getFactory().getVoteDao();
		ThemeDao themeDao = DaoFactory.getFactory().getThemeDao();
		int id = voteDao.findAll().size();
		Theme theme = themeDao.findByName(themeName);
		voteDao.create(new Vote(id, vote, theme));
		return showVotingController.showVoting();
	}
}
