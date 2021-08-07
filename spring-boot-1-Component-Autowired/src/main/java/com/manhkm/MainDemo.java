package com.manhkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainDemo {
    public static void main(String[] args) {

        // create container:
        ApplicationContext context = SpringApplication.run(MainDemo.class, args);

        // get bean outfit:
        Outfit outfit = context.getBean(Outfit.class);

        System.out.println("Instance: " + outfit);

        outfit.wear();

        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Instance: " + girl);
        System.out.println("Girl Outfit: " + girl.outfit);

        girl.outfit.wear();

    }
}
