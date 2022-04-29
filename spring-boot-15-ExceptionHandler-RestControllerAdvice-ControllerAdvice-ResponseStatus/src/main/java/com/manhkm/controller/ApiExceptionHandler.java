package com.manhkm.controller;

import com.manhkm.services.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/**
 * @author ManhKM on 8/12/2021
 * @project spring-boot-exam
 * -----
 * ApiExceptionHandler -> nơi quản lý tất cả các Exception.
 *
 */
@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage handleAllException(Exception ex, WebRequest request){

        return new ErrorMessage(1000, ex.getLocalizedMessage());
    }


    /**
     * Trong đó IndexOutOfBoundsException sẽ là lỗi trả về cho Exception khi làm việc với Java.
     * Lúc này sẽ trường hợp lỗi và xử lý nó.xxxxx
     * @ExceptionHandler làm mục đích chính là gì
     * @ResponseStatus làm mục đích chính là gì?
     * -----
     * WebRequest mục đích gì
     * ErrorMessage làm mục đích gì
     *
     */
    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage TodoException(Exception ex, WebRequest request){

        return new ErrorMessage(5001, "Đối tượng không tồn tại");
    }
}
