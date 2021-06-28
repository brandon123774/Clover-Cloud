package com.clover.edgeservice.exception;

public class InvalidLogIdException extends RuntimeException {
    public InvalidLogIdException(int id) {
        super("No log exists with that id" + id);
    }
}
