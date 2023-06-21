package com.aulaSpring.cursoJava.service.exceptions;

public class DatabaseException extends RuntimeException{
    private static final Long serialVersionUID = 1L;

    public DatabaseException(String msg){
        super(msg);
    }
}
