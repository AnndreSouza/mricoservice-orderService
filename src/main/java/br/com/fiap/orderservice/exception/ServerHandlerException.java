package br.com.fiap.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.lang.Exception;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ServerHandlerException extends Exception {
    public ServerHandlerException(String message) {
        super(message);
    }
}
