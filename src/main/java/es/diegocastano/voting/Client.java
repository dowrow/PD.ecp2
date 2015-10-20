package es.diegocastano.voting;

import es.diegocastano.voting.web.http.HttpRequest;
import es.diegocastano.voting.web.http.HttpResponse;

public class Client {

    public HttpResponse send(HttpRequest request) {
        return new Server().send(request);
    }

}
