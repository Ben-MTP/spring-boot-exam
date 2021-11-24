package com.manhkm;

import com.manhkm.entity.Girl;
import com.manhkm.entity.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainInjection {
    /***
     * TH1 -> Outfit outfit1 = context.getBean(AoDai.class);        -> OK
     * TH2 -> Outfit outfit1 = context.getBean(Biniki.class);       -> OK
     * TH3 -> Outfit outfit1 = context.getBean(Outfit.class);       -> Find 2 Object
     *    Sử dụng @Qualifier hoặc @Primary
     *    Để chỉ định phần nào là chính.
     *
     * @param args
     */
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MainInjection.class);
        System.out.println("Running Spring Boot Application!");

        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl instance: " + girl);
        System.out.println("Girl outfit: " + girl.getOutfit());
        girl.getOutfit().wear();
    }
}
