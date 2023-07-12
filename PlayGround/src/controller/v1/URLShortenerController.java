package controller.v1;

import domain.Request;
import domain.Response;
import service.URLShortenerService;
import service.URLShortenerServiceImpl;

// v1/urlShorten
public class URLShortenerController {
    // act as first point of contact to consume the request
    // forward this to a service class serviceResponse
    // forward back as a response
    // status codes
    private URLShortenerService urlShortenerService;

    public URLShortenerController() {
        this.urlShortenerService = new URLShortenerServiceImpl();
    }

    public Response generateShortenedUrl(final Request request){
        // use the service class method and get the response.
        return urlShortenerService.generateShortenedUrl(request);
    }
}
