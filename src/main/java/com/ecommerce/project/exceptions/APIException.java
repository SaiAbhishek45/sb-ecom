package com.ecommerce.project.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class APIException extends RuntimeException {

    private String message;
    private String errorCode;
    private LocalDateTime timestamp;


    public APIException(String message, String errorCode) {
        super(message);
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.errorCode = errorCode;

    }

}
