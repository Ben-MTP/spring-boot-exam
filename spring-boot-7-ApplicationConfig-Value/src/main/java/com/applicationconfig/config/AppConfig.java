package com.applicationconfig.config;

import com.applicationconfig.entity.User;
import com.applicationconfig.services.DatabaseConnector;
import com.applicationconfig.services.impl.MySQLConnector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
@Configuration
public class AppConfig {

    /**
     * Lấy giá trị config từ file application.properties
     * Annotation: @Value -> đọc giá trị từ file config.
     *      format: ${....}
     *
     */
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

    /**
     * Thực hiện khởi tạo Bean cho việc Connection đến Database MySQL.
     * @return
     */
    @Bean("mysqlConfigure")
    DatabaseConnector mysqlConfigure(){
        DatabaseConnector mySqlConnector = new MySQLConnector();
        System.out.println("Config MySQL Url: " + mySqlUrl);
        mySqlConnector.setUrl(mySqlUrl);

        // Set username, password, format....
        return mySqlConnector;
    }
}
