package com.manhkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HelloMain.class);
        System.out.println("Spring Boot Application Running!");
    }
}
