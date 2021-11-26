package com.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        GirlService girlService = context.getBean(GirlService.class);

        Girl girl = girlService.getRandomGirl();

        System.out.println(girl);
    }
}
