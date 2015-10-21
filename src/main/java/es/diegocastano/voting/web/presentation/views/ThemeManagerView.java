package es.diegocastano.voting.web.presentation.views;

import es.diegocastano.voting.web.presentation.models.Model;

public class ThemeManagerView implements View {

	@Override
	public void show(Model model) {
		
		System.out.println("Theme Manager Page");
		System.out.println("\tTemas: " + model.get("themes"));
	}

}
