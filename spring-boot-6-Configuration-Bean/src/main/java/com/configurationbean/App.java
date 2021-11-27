package com.configurationbean;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 * TH1: Nếu dùng chính class SimpleBean -> thì cần chỉ ra đâu ra @Primary
 *
 * TH2: Nếu muốn chỉ ra đâu là bean chính -> có thể đặt tên cho các Bean đó
 *      Rồi trong phần getBean -> thì get ra Bean cần lấy.
 *
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        //Get Bean "SimpleBean -> manhkm"
        //SimpleBean bean = (SimpleBean) context.getBean("ngocTrinh");
        SimpleBean bean = (SimpleBean) context.getBean(SimpleBean.class);

        System.out.println(bean.toString());
    }
}
