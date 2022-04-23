package com.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * ---
 * Tại sao Main chạy 2 lần.
 *      -> Lần 1: Do người chạy bằng tay
 *      -> Lần 2: Do Spring Boot chạy.
 *              SpringApplication.run(Main.class, args);
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("> Trước khi IoC Container được khởi tạo");
        ApplicationContext context = SpringApplication.run(Main.class, args);

        System.out.println("> Sau khi IoC Container được khởi tạo");

        Girl ngocTrinh = context.getBean(Girl.class);
        System.out.println("> Trước khi IoC Container destroy Girl");

        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(ngocTrinh);

        System.out.println("> Sau khi IoC Container destroy ngocTrinh");
    }
}
