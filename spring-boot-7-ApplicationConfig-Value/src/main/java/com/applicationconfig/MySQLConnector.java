package com.applicationconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
public class MySQLConnector extends DatabaseConnector{

    @Autowired
    User user;

    @Override
    public void connect() {
        System.out.println("Đã kết nối với Database MySQL: " + getUrl() +"?user="+ user.getUsername() +"?password="+ user.getPassword());
    }
}
