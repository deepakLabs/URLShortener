import controller.v1.URLShortenerController;
import domain.Request;

import java.util.*;

/*
* Design a URL shortening service like Bit.ly or TinyURL.
* The service should take a long URL as input and return a shortened URL that redirects to the original long URL when visited.
Requirements:

Given a long URL, generate a unique shortened URL that is easy to remember and share.
When a user visits the shortened URL, they should be redirected to the original long URL.
The service should be scalable and able to handle a large number of requests.
The shortened URLs should be as short as possible.
The system should provide analytics on the number of clicks each shortened URL receives.

* API: URlShortener
* Input: <url>
* Ouput: <shorten_url>
*
*
*
* */
public class Main {
    public static void main(String[] args) {
        URLShortenerController controller = new URLShortenerController();
        Request request = new Request("google.com/abcd");
        System.out.println(controller.generateShortenedUrl(request).getShortendUrl());

    }
}