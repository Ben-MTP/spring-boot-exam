package com.manhkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 8/12/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class ExceptionHandlerMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ExceptionHandlerMain.class);
        System.out.println("ExceptionHandler - RestController Advice... running!!!");
    }
}
