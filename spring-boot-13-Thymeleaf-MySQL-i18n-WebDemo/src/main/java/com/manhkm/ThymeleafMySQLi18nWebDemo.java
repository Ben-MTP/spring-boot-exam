package com.manhkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class ThymeleafMySQLi18nWebDemo {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ThymeleafMySQLi18nWebDemo.class);

        System.out.println("Thymeleaf MySQL i18n WebDemo Running!");


    }
}
