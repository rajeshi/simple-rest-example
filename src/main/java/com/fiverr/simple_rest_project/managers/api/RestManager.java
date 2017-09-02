package com.fiverr.simple_rest_project.managers.api;

import com.fiverr.simple_rest_project.rest.modules.Authentication;
import com.fiverr.simple_rest_project.rest.modules.BasicMediaTypes;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class RestManager extends RestFactory {

    private ThreadLocal<Response> lastResponse = new ThreadLocal<>();

    public RestManager(BasicMediaTypes mediaType, Authentication auth, Headers headers) {
        super(mediaType, auth, headers);
    }

    public Response get(String baseUrl, String resourceUrl) {
        Response response = getRequestSpec().baseUri(baseUrl).get(resourceUrl);
        return response;
    }

    public <T> Response post(String baseUrl, String resourceUrl, T body) {
        Response response = getRequestSpec().baseUri(baseUrl).body(body).post(resourceUrl);
        return response;
    }

    public <T> Response put(String baseUrl, String resourceUrl, T body) {
        Response response = getRequestSpec().baseUri(baseUrl).body(body).put(resourceUrl);
        return response;
    }

    public Response delete(String baseUrl, String resourceUrl) {
        Response response = getRequestSpec().baseUri(baseUrl).get(resourceUrl);
        return response;
    }
}
