package es.diegocastano.voting.web.presentation.presenters;

import java.util.Map;

import es.diegocastano.voting.rest.business.controllers.CreateThemeController;
import es.diegocastano.voting.rest.business.controllers.ShowThemeManagerController;
import es.diegocastano.voting.web.presentation.models.Model;

public class ThemeManagerPresenter {

	private String themeName;
	
	public String showThemeManager(Model model) {
		ShowThemeManagerController showThemeManagerController = new ShowThemeManagerController();
		model.put("themes", showThemeManagerController.showThemeManager());
		return "ThemeManagerView";
	}

	public String createTheme(Model model) {
		CreateThemeController createThemeController = new CreateThemeController();
		model.put("themes", createThemeController.createTheme(themeName));
		return "ThemeManagerView";
	}

	public void setters(Map<String, String> params) {
		themeName = params.get("themeName");
	}

}
