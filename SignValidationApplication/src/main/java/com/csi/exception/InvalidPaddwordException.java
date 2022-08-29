package com.csi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InvalidPaddwordException extends Exception{
    public InvalidPaddwordException(String message) {
        super(message);
    }
}
