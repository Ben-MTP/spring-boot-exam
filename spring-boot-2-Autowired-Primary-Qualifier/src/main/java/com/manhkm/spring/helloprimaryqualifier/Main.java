package com.manhkm.spring.helloprimaryqualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/24/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class);
        Outfit outfit = context.getBean(Outfit.class);

        System.out.println(outfit);
        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Instance: " + girl);
        System.out.println("Girl Outfit: " + girl.getOutfit());
        girl.getOutfit().wear();
    }
}
