package com.sample.service.dto;

/**
 * @author Neetha Hiremath
 */
public class GreetingResponse {

    private String name;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}