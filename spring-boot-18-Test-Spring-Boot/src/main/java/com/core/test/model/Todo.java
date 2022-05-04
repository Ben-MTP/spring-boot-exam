package com.core.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-boot-18-Test-Spring-Boot
 */
@Data
@AllArgsConstructor
public class Todo {
    private int id;
    private String title;
    private String detail;
}
