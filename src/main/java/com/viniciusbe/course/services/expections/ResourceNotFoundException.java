package com.viniciusbe.course.services.expections;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id: " + id);
    }
}
