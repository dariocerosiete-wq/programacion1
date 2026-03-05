package com.rpg.handler;

public class FormatoInvalidoException extends RPGDataException{
    public FormatoInvalidoException(String message) {
        super(message);
    }

    public FormatoInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
}
