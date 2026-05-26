package com.practica.p2.exceptionHandler;

import java.util.UUID;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
            super(message);
    }
}
