package com.example.thymeleafdemo;

public class Err {
    private int status;
    private String errorDescription;

    @Override
    public String toString() {
        return "Error{" +
                "status=" + status +
                ", errorDescription='" + errorDescription + '\'' +
                '}';
    }

    public Err(int status, String errorDescription) {
        this.status = status;
        this.errorDescription = errorDescription;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
