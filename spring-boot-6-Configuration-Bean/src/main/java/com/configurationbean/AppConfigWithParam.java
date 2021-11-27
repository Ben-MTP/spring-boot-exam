package com.configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
@Configuration
public class AppConfigWithParam {

    /**
     * Có cần phải tạo cùng một bean ở trong một class hay không?
     * Nếu theo cơ chế của Spring Context quản lý thì đâu cần đến nó.
     *
     * @param user
     * @return
     */
    @Bean("mySqlConnectionWithUser")
    DatabaseConnector mySqlConnectionWithUser(SimpleBean user){
        DatabaseConnector mySqlConector = new MySQLConnector();
        mySqlConector.setUrl("jdbc:mysql://host1:3306/vlxx_movie?user=" + user.getUsername());

        return mySqlConector;
    }
}
