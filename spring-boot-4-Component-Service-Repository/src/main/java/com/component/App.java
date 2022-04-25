package com.component;

import com.component.model.Girl;
import com.component.service.impl.GirlService;
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

        /**
         * Trước đó: GirlService đã được đánh dấu @Service -> và được Container Quản lý.
         * Để dùng nó: context.getBean...
         */
        GirlService girlService = context.getBean(GirlService.class);

        Girl girl = girlService.getRandomGirl();

        System.out.println(girl);
        // Girl{name='TOETIPKWOA-from-database'}
    }
}
