package es.diegocastano.voting.rest.business.controllers;

import java.util.List;

import es.diegocastano.voting.rest.business.models.entities.Theme;
import es.diegocastano.voting.rest.data.models.daos.DaoFactory;
import es.diegocastano.voting.rest.data.models.daos.ThemeDao;

public class CreateThemeController {
	ShowThemeManagerController showThemeManagerController = new ShowThemeManagerController();

	public List<String> createTheme(String themeName) {
		ThemeDao themeDao = DaoFactory.getFactory().getThemeDao();
		int id = themeDao.findAll().size();
		themeDao.create(new Theme(id, themeName));
		return showThemeManagerController.showThemeManager();
	}

}
