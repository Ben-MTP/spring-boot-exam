package com.manhkm.services;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ManhKM on 8/12/2021
 * @project spring-boot-exam
 * -----
 * ErrorMessage -> để chứa các thông tin trả về cho client.
 */
@Data
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private String message;
}
