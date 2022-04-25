package com.componentscan;

import com.componentscan.model.Girl;
import com.componentscan.others.OtherGirl;
import com.componentscan.others1.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * -----
 * Cách 1: + @ComponentScan("com.componentscan.others")
 *      Một Annotation riêng biệt
 * Cách 2: + scanBasePackages -> là một tính năng con trong: SpringBootApplication
 */

@SpringBootApplication(scanBasePackages = "com.componentscan.others1")
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            girl.setName("Ngọc Trinh");
            System.out.println("Bean " + girl.toString());
        } catch (Exception e){
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            otherGirl.setName("Thu Hoài");
            System.out.println("Bean " + otherGirl.toString());
        } catch (Exception e){
            System.out.println("Bean OtherGirl không tồn tại");
        }

        try {
            Student student = context.getBean(Student.class);
            student.setName("ManhKM");
            System.out.println("Bean " + student.toString());
        } catch (Exception e){
            System.out.println("Bean Student không tồn tại");
        }
    }
}
