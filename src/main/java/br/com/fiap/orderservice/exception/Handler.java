package br.com.fiap.orderservice.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Handler {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String message;
    private String details;

    public Handler (LocalDateTime timer, String msg, String det) {
        super();
        this.timestamp = timer;
        this.message = msg;
        this.details = det;
    }
}
