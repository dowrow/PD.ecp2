package es.diegocastano.voting.rest.business.controllers;

import java.util.ArrayList;
import java.util.List;

import es.diegocastano.voting.rest.business.models.entities.Theme;
import es.diegocastano.voting.rest.business.models.entities.Vote;
import es.diegocastano.voting.rest.business.views.ThemeTransfer;
import es.diegocastano.voting.rest.data.models.daos.DaoFactory;
import es.diegocastano.voting.rest.data.models.daos.ThemeDao;
import es.diegocastano.voting.rest.data.models.daos.VoteDao;

public class ShowVotingController {
	
	public List<ThemeTransfer> showVoting() {
		ThemeDao themeDao = DaoFactory.getFactory().getThemeDao();
		VoteDao voteDao = DaoFactory.getFactory().getVoteDao();
		
		List<Theme> themes = themeDao.findAll();
		
		List<ThemeTransfer> themeTransfers = new ArrayList<ThemeTransfer>();
		for (Theme theme : themes) {
			List<Vote> votes = voteDao.findByTheme(theme);
			double average = getAverage(votes);
			themeTransfers.add(new ThemeTransfer(theme.getName(), average));
		}
		
		return themeTransfers;
	}

	private double getAverage(List<Vote> votes) {
		double average = 0;
		for (Vote vote : votes) {
			average += vote.getVote();
		}
		return average/votes.size();
	}
}
