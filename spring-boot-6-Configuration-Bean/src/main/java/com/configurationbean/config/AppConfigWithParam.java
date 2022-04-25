package com.configurationbean.config;

import com.configurationbean.service.DatabaseConnector;
import com.configurationbean.service.impl.MySQLConnector;
import com.configurationbean.entity.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 * -----
 *
 */
@Configuration
public class AppConfigWithParam {

    /**
     * Có cần phải tạo cùng một bean ở trong một class hay không?
     *      Nếu theo cơ chế của Spring Context quản lý thì đâu cần đến nó.
     * TH1: Đã có AppConfig.java -> cấu hình các Bean cần dùng.
     * Th2: Nếu không có file configuration trước đó.
     * @param user
     * @return
     */
    @Bean("mySqlConnectionWithUser")
    DatabaseConnector mySqlConnectionWithUser(SimpleBean user){
        DatabaseConnector mySqlConector = new MySQLConnector();
        mySqlConector.setUrl("jdbc:mysql://host1:3306/vlxx_movie?user=" + user.getUsername());

        return mySqlConector;
    }

    /**
     * Th3: Có thể cấu hình Bean và Bean phức tạp -> sử dụng làm đầu vào của Bean khác ở trong cùng một file
     *      + IDE sẽ không báo lỗi.
     * @return
     */
    @Bean
    SimpleBean createInstanceBean(){
        return new SimpleBean("manhkm-app-config-param");
    }
}
