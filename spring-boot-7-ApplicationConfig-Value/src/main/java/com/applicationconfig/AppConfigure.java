package com.applicationconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
@Configuration
public class AppConfigure {

    @Value("${url.mysql}")
    String mySqlUrl;

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @Bean("user")
    User getUser(){
        User user = new User(username, password);
        return user;
    }

    @Bean("mySqlConnector")
    DatabaseConnector getDataConnector(User user){
        DatabaseConnector mySQLConnector = new MySQLConnector();
        mySQLConnector.setUrl(mySqlUrl);
        return mySQLConnector;
    }
}
