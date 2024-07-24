package com.walking.lesson20.exceptions.task3.exception;

public class UnknownAnimalException extends RuntimeException {
    public UnknownAnimalException(String message) {
        super(message);
    }
}
