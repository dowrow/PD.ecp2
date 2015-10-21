package es.diegocastano.voting.web.presentation.presenters;

import es.diegocastano.voting.rest.business.controllers.CreateThemeController;
import es.diegocastano.voting.web.presentation.models.Model;

public class ThemeManagerPresenter {

	
	public String process(Model model) {
		model.put("themes", "[]");
		return "ThemeManagerView";
	}

	public String createTheme(Model model, String themeName) {
		CreateThemeController createThemeController = new CreateThemeController();
		model.put("themes", createThemeController.createTheme(themeName));
		return "ThemeManagerView";
	}

}
