package com.manhkm.services;

import lombok.Data;

/**
 * @author ManhKM on 8/11/2021
 * @project spring-boot-exam
 */
@Data
public class Todo {
    private String title;
    private String detail;

    public Todo(){}
    public Todo(String title, String detail){
        this.title = title;
        this.detail = detail;
    }
}
