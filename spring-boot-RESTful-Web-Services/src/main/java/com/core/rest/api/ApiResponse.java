package com.core.rest.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.http.HttpStatus;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
public class ApiResponse {
    private String status;
    private String message;
    @JsonInclude(Include.NON_NULL)
    private Object data;

    public ApiResponse() {
        this.status = "1";
        this.message = "Success";
    }

    public ApiResponse(HttpStatus status, String message) {
        this.status = status.toString();
        this.message = message;
    }

    public ApiResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ApiResponse(Object data) {
        this.status = "1";
        this.message = "Success";
        this.data = data;
    }

    public String getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return this.data;
    }

    public ApiResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public ApiResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public ApiResponse setData(Object data) {
        this.data = data;
        return this;
    }

    public ApiResponse setResponse(String status, String message) {
        this.status = status;
        this.message = message;
        return this;
    }

    public static ApiResponse build() {
        return new ApiResponse();
    }
}
