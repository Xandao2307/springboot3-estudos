package com.aulaSpring.cursoJava.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final Long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }

}
