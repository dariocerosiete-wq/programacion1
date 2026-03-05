package com.rpg.handler;
//Exception ya existe
public class RPGDataException extends Exception{

    public RPGDataException(String message) {
        super(message);
    }

    public RPGDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public RPGDataException() {
    }
}
