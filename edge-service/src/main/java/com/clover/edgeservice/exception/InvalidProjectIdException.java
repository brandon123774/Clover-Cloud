package com.clover.edgeservice.exception;

public class InvalidProjectIdException extends RuntimeException {
    public InvalidProjectIdException(int id) {
        super("No project exists with that id" + id);
    }
}
