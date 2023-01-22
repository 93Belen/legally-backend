package com.example.legally;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiResponse {
    private String response;

    public void getApiResponse() throws Exception {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.abortionpolicyapi.com/v1/gestational_limits/states"))
                .header("token", "api key goes here")
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Origin", "http://localhost:3000")
                .header("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE")
                .GET()
                .build();

        HttpClient httpClient = java.net.http.HttpClient.newHttpClient();
        HttpResponse<String> getApi =  httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        this.response = getApi.body();
    }

    public String getResponse() throws Exception {
        getApiResponse();
        return response;
    }



    // For minors info

    public void getApiResponseMinor() throws Exception {
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.abortionpolicyapi.com/v1/minors/states/"))
                .header("token", "api key goes here")
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Origin", "http://localhost:3000")
                .header("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE")
                .GET()
                .build();

        HttpClient httpClient = java.net.http.HttpClient.newHttpClient();
        HttpResponse<String> getApi =  httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        this.response = getApi.body();
    }

    public String getResponseMinor() throws Exception {
        getApiResponseMinor();
        return response;
    }

}
