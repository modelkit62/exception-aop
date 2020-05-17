package com.example.exceptionaop.utils;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ApiUtils {

    private ApiUtils(){}

    public static Object miMetodo(RestTemplate restTemplate, String url, Class<?> responseType)  {
        return restTemplate.getForObject(url, responseType);
    }

}
