package es.diegocastano.voting;

import es.diegocastano.voting.web.http.HttpMethod;
import es.diegocastano.voting.web.http.HttpRequest;
import es.diegocastano.voting.web.http.HttpResponse;
import es.diegocastano.voting.web.http.HttpStatus;
import es.diegocastano.voting.web.presentation.frontController.FrontController;

public class Server {

    public HttpResponse send(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        if (HttpMethod.GET.equals(request.getMethod())) {
            new FrontController().doGet(request, response);
        } else if (HttpMethod.POST.equals(request.getMethod())) {
            new FrontController().doPost(request, response);
        }
        response.setStatus(HttpStatus.OK);
        return response;
    }

}
