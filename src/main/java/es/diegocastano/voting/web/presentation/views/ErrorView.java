package es.diegocastano.voting.web.presentation.views;

import es.diegocastano.voting.web.presentation.models.Model;

public class ErrorView implements View {

    @Override
    public void show(Model model) {
        System.out.println("Error \n   Lo siento, petición incorrecta. " + model.get("error"));
    }

}
