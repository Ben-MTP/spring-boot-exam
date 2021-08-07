package com.manhkm;

import com.manhkm.entity.Bikini;
import com.manhkm.entity.Girl;
import com.manhkm.entity.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainInjection {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MainInjection.class);
        System.out.println("Spring Boot Application!");

        Outfit outfit = context.getBean(Outfit.class);
        System.out.println("===> outfit: " + outfit);
        outfit.wear();

        Girl girl = new Girl();
        girl.outfit = outfit;
        girl.getOutfit().wear();

    }
}
