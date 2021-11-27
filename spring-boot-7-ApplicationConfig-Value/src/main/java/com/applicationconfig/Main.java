package com.applicationconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class);

        DatabaseConnector mySqlConnector = (DatabaseConnector) context.getBean("mySqlConnector");
        mySqlConnector.connect();
    }
}
