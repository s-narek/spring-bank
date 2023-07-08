package com.narek.bank.springbank.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Class clazz, Object id) {
        super(String.format("Entity '%s' with ID '%s' is not found", clazz.getName(), id));
    }
}
