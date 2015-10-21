package es.diegocastano.voting.rest.business.controllers;

import java.util.List;

import es.diegocastano.voting.rest.data.models.daos.DaoFactory;
import es.diegocastano.voting.rest.data.models.daos.ThemeDao;

public class ShowThemeManagerController {
	public List<String> showThemeManager() {
		ThemeDao themeDao = DaoFactory.getFactory().getThemeDao();
		return themeDao.findAllNames();
	}
}
