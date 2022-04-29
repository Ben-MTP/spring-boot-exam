package com.core.manhkm;

import com.core.manhkm.model.LocalDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        ConfigurableEnvironment environment = new StandardEnvironment();
        environment.setActiveProfiles("aws");
        application.setEnvironment(environment);
        ApplicationContext context = application.run(args);
        LocalDatasource localDatasource = context.getBean(LocalDatasource.class);
        System.out.println(localDatasource);
    }

}
