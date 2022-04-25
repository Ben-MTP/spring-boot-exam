package com.applicationconfig;

import com.applicationconfig.services.DatabaseConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 4/25/2022
 * @project spring-boot-7-ApplicationConfig-Value
 */
@SpringBootApplication
public class AppTestMySQLConfig {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppTestMySQLConfig.class, args);

        DatabaseConnector databaseConnector = (DatabaseConnector) context.getBean("mysqlConfigure");
        databaseConnector.connect();

    }
}
