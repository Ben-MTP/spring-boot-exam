package com.configurationbean;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class AppDatabaseConnectionWithParam {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppDatabaseConnectionWithParam.class);

        MySQLConnector mySQLConnector = (MySQLConnector) context.getBean("mySqlConnectionWithUser");
        mySQLConnector.connect();
    }
}
