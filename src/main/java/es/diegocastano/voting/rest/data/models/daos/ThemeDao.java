package es.diegocastano.voting.rest.data.models.daos;

import java.util.List;

import es.diegocastano.voting.rest.business.models.entities.Theme;

public interface ThemeDao {

	Theme findByName(String themeName);

	List<String> findAllNames();

}
