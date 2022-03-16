package com.configurationbean;

import com.configurationbean.entity.SimpleBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 3/16/2022
 * @project spring-boot-6-Configuration-Bean
 */
@SpringBootApplication
public class TestGetBean {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestGetBean.class, args);

        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        System.out.println("Simple bean Example: " + simpleBean.toString());
    }
}
