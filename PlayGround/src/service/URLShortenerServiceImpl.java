package service;

import domain.Request;
import domain.Response;
import entity.Mapping;
import startegy.HashCodeStartegy;
import startegy.URLShortenerStrategy;

public class URLShortenerServiceImpl implements URLShortenerService{
    private URLShortenerStrategy shortenerStrategy;

    private Mapping mapping;

    public URLShortenerServiceImpl(){
        shortenerStrategy = new HashCodeStartegy();
        mapping = new Mapping();
    }

    @Override
    public Response generateShortenedUrl(Request request) {
        // Logic to process the incoming request
        String url = request.getUrl();
        // add logic to verify the incoming url
        String shortedURl = shortenerStrategy.shortenURL(url);
        // create the shorted url startey package
        // save it somewhere [save it in db] <url> <shortURL>
        mapping.save(url,shortedURl);
        // enitiy/repository package
        Response response = new Response(shortedURl);
        // return that url
        return response;
    }
}
