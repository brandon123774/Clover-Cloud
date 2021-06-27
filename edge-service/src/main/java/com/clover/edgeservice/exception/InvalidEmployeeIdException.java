package com.clover.edgeservice.exception;

public class InvalidEmployeeIdException extends RuntimeException {
    public InvalidEmployeeIdException(int id)   {
        super("No employee exists with that id" + id);
    }
}
