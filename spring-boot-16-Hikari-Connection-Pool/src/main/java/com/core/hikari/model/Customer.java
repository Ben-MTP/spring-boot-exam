package com.core.hikari.model;

import java.util.Date;

/**
 * @author ManhKM on 4/19/2022
 * @project spring-boot-16-Hikari-Connection-Pool
 */
public class Customer {
    int id;
    String name;
    String email;
    Date date;

    public Customer(int id, String name, String email, Date date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date = date;
    }
}
