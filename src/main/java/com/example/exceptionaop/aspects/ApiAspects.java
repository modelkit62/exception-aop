package com.example.exceptionaop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApiAspects {

    private Logger LOGGER = LoggerFactory.getLogger(getClass().getName());

    @Before("execution(public String handleException_RestClientException(*))")
    public void beforerestClient_HandlerAdvice() {
        LOGGER.info("Exception 1");
        System.out.println("\n=====>>> Executing @Before advice on handleException_RestClientException()");
    }

    @Before("execution(public String handleException_IOException(*))")
    public void beforeIOException_HandlerAdvice() {
        LOGGER.info("Exception 2");
        System.out.println("\n=====>>> Executing @Before advice on handleException_IOException()");
    }

}
