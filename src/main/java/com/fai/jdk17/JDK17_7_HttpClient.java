package com.fai.jdk17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JDK17_7_HttpClient {

    public static void main(String[] args) throws Exception {

        Stream.of(1,2,3,4,5,6,7,8)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

//        java8way();

        java17way();

    }

    public static void java8way() throws Exception {
        URL url = new URL("https://jsonplaceholder.typicode.com/todos");
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.addRequestProperty("Accept", "application/json");
        connection.addRequestProperty("Content-Type", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        final String responseString = br
                .lines()
                .collect(Collectors.joining("\n"));

        System.out.println(responseString);
    }

    public static void java17way() throws Exception {
        final HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/todos"))
                .GET()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .build();
        final HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        Record oke = new Record();
    }

    public static class Record{}

}


