package com.springboot.demo.com.entity;

import lombok.Data;

/**
 * @author ManhKM on 8/26/2021
 * @project spring-boot-exam
 * -----
 * không đặt package là services -> mà chuyển thành model
 */
@Data
public class Todo {
    public String title;
    public String detail;
}