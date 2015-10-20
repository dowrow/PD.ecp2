package es.diegocastano.voting.web.presentation.frontController;

import es.diegocastano.voting.web.http.HttpRequest;
import es.diegocastano.voting.web.http.HttpResponse;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    public void doGet(HttpRequest request, HttpResponse response) {
        dispatcher.doGet(request, response);
    }
    
    public void doPost(HttpRequest request, HttpResponse response) {
        dispatcher.doPost(request, response);
    }

}
