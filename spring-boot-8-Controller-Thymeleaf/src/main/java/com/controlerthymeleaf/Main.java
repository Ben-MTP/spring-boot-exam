package com.controlerthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 * -----
 * Nếu chạy thông thường, không cần phải get các Bean trong hàm main
 *      Thì không cần phải sử dụng:
 *          ApplicationContext context.
 *      Mà chỉ cần SpringApplication.run()....
 *
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
        System.out.println("Running Spring Boot Application!");
    }
}
