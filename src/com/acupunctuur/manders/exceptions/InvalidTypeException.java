package com.acupunctuur.manders.exceptions;

public class InvalidTypeException extends Exception{

    private static final long serialVersionUID = 1L;

    public InvalidTypeException(String errorMessage) {
        super(errorMessage);
    }
}
