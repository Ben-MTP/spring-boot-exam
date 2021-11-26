package com.componentscan;

import com.componentscan.others.OtherGirl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * @ComponentScan("com.componentscan.others")
 *
 */


@SpringBootApplication(scanBasePackages = "com.componentscan.others")
public class App {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(App.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            girl.setName("Ngọc Trinh");
            System.out.println("Bean " + girl.toString());
        } catch (Exception e){
//            e.printStackTrace();
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            otherGirl.setName("Thu Hoài");
            System.out.println("Bean " + otherGirl.toString());
        } catch (Exception e){
//            e.printStackTrace();
            System.out.println("Bean OtherGirl không tồn tại");
        }
    }
}
