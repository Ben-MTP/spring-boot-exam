package com.manhkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 8/11/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class RestfullApiMain {
    public static void main(String[] args) {
        SpringApplication.run(RestfullApiMain.class);
        System.out.println("Restfull Api - RestController - PathVariable Running....");
    }
}
