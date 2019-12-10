package com.sample.service.JavaPrograms;

public class CustomException extends Exception {
    private String code;
    private String description;

    public CustomException(String code, String description) {
        super("[" + code + "] : " + description);

        this.code = code;
        this.description = description;
    }

    public CustomException(String description) {
        super(description);

        this.description = description;
    }

    public CustomException(String code, String description, Throwable thr) {
        super("[" + code + "] : " + description, thr);

        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}

