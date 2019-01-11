package com.gyyx.java;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * des: 新的HttpClientAPI, 支持HTTP_2和websocket
 * created by miapoeng on 2019/1/11 16:26
 */
public class HttpClientTest {

    public static void main(String[] args) throws Exception{
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://www.gyyx.cn")).GET().build();
        HttpResponse<String> send = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(send.statusCode());
        System.out.println(send.version().name());
        System.out.println(send.body());


    }
}
