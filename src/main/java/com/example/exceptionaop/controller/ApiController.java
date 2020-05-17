package com.example.exceptionaop.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.*;

import static com.example.exceptionaop.utils.ApiUtils.miMetodo;

@RestController
public class ApiController {

    @RequestMapping("/books")
    public String getBooks() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        /*Reader fileReader = new FileReader("c:\\data\\input-text.txt");
        int read = fileReader.read();*/
        Object forObject = null;
        /*try {*/
            String url = "https://www.googleapis.com/books/v1/volumes/QJREAQAAMAAJ3";
            forObject = miMetodo(restTemplate, url, Object.class);
        /*} catch (RestClientException e) {
            System.out.println("xxx");
            throw new RestClientException("Dummy String");
            // return e.getMessage();
        }*/
        return forObject.toString();
    }
}
