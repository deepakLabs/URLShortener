package service;

import domain.Request;
import domain.Response;

public interface URLShortenerService {
    public Response generateShortenedUrl(Request request);
}
