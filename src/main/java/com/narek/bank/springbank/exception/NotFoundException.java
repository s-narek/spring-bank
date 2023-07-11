package com.narek.bank.springbank.exception;

public class NotFoundException extends RuntimeException {
    /**
     * Entity is not found.
     * @param clazz - Entity
     * @param id - Entity id
     */
    public NotFoundException(final Class clazz, final Object id) {
        super(String.format("Entity '%s' with ID '%s' is not found", clazz.getName(), id));
    }
}
