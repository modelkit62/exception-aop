package com.example.exceptionaop.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

@Component
@ControllerAdvice
public class ExceptionAopHandler {

    private Logger LOGGER = LoggerFactory.getLogger(ExceptionAopHandler.class);

    @ExceptionHandler(RestClientException.class)
    public String handleException_RestClientException(RestClientException e){
        System.out.println("Inside ====> handleException_RestClientException, the message is as follows: ");
        LOGGER.info(e.getMessage());
        return e.getMessage();
    }

    @ExceptionHandler(IOException.class)
    public String handleException_IOException(IOException e){
        System.out.println("Inside ====> handleException_IOException, the message is as follows: ");
        LOGGER.info(e.getMessage());
        return e.getMessage();
    }
}
