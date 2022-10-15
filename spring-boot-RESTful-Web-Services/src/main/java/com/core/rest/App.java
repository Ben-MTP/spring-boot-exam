package com.core.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("SERVER_IS_STARTED");
    }
}
