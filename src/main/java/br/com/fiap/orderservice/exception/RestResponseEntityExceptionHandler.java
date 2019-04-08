package br.com.fiap.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ServerErrorException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(OrderNotFound.class)
    public final ResponseEntity<Object> handleAllExceptions(OrderNotFound ex, WebRequest request) {
        Handler exceptionResponse =
                new Handler(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(OrderUpdateException.class)
    public final ResponseEntity<Object> handleAllExceptions(OrderUpdateException ex, WebRequest request) {
        Handler exceptionResponse =
                new Handler(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ServerErrorException.class)
    public final ResponseEntity<Object> handleAllExceptions(ServerErrorException ex, WebRequest request) {
        Handler exceptionResponse =
                new Handler(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
