package es.diegocastano.voting.rest.data.models.daos;

import java.util.List;

import es.diegocastano.voting.rest.business.models.entities.Theme;
import es.diegocastano.voting.rest.business.models.entities.Vote;

public interface VoteDao {

	List<Vote> findByTheme(Theme theme);

}
