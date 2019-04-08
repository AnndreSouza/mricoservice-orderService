package br.com.fiap.orderservice.exception;

import static br.com.fiap.orderservice.exception.Exception.generateMessage;
import static br.com.fiap.orderservice.exception.Exception.toMap;
import java.lang.Exception;


public class EntityNotFoundException extends Exception {

    public EntityNotFoundException(Class clazz, String searchParamsMap) {
        super(generateMessage(clazz.getSimpleName(), toMap(String.class, String.class, searchParamsMap)));
    }
}
