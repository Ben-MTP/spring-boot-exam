package com.manhkm.services;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ManhKM on 8/12/2021
 * @project spring-boot-exam
 */
@Data
@AllArgsConstructor
public class Todo {
    private String title;
    private String detail;
}
