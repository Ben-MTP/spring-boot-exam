package com.configurationbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class AppDatabaseConnection {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppDatabaseConnection.class);

        MySQLConnector mySQLConnector = (MySQLConnector) context.getBean("mySqlConnector");
        mySQLConnector.connect();

        MongoDBConnector mongoDBConnector = (MongoDBConnector) context.getBean("mongoDBConnector");
        mongoDBConnector.connect();

        PostgreSqlConnector postgreSqlConnector = (PostgreSqlConnector) context.getBean("postgreSqlConnector");
        postgreSqlConnector.connect();
    }
}
