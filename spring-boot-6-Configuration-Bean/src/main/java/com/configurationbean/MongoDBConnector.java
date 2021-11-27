package com.configurationbean;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 */
public class MongoDBConnector extends DatabaseConnector{

    @Override
    public void connect() {
        System.out.println("Đã connect đến MongoDB: " + getUrl());
    }
}
