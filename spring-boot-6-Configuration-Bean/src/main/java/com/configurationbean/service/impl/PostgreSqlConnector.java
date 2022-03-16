package com.configurationbean.service.impl;

import com.configurationbean.service.DatabaseConnector;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 */
public class PostgreSqlConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Đã kết nối đến PostgreSql: " + getUrl());
    }
}
