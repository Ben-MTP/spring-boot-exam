package com.configurationbean;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 */
public class MySQLConnector extends DatabaseConnector{
    @Override
    public void connect() {
        System.out.println("Đã kết nối đến MySQL: " + getUrl());
    }
}
