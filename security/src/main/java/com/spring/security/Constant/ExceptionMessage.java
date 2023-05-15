package com.spring.security.Constant;

public enum ExceptionMessage {
    STUDENT_NOT_FOUND("Student not found");
    private String message ;
    private ExceptionMessage(String message) {
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
