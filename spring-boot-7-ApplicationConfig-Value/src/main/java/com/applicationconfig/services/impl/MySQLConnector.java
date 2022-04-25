package com.applicationconfig.services.impl;

import com.applicationconfig.entity.User;
import com.applicationconfig.services.DatabaseConnector;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
public class MySQLConnector extends DatabaseConnector {

    @Autowired
    User user;

    /**
     * Triển khai connection đến Database thông qua các thông tin từ
     * DatabaseConnection.java
     *
     */
    @Override
    public void connect() {
        System.out.println("Đã kết nối với Database MySQL: " + getUrl() +"?user="+ user.getUsername() +"?password="+ user.getPassword());
    }
}
