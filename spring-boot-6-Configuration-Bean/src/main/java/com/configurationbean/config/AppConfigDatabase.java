package com.configurationbean.config;

import com.configurationbean.service.DatabaseConnector;
import com.configurationbean.service.impl.MongoDBConnector;
import com.configurationbean.service.impl.MySQLConnector;
import com.configurationbean.service.impl.PostgreSqlConnector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 * ---
 * Thực hiện cho việc Demo ví dụ Connection với Database.
 * Việc connection đến Database không chỉ 1 Database mà có nhiều
 *      + MongoDB
 *      + MySQL
 *      + PostgreSQL
 * -----
 * Việc cấu hình Bean không có tham số.
 * Việc cấu hình Bean có tham số.
 *
 */
@Configuration
public class AppConfigDatabase {

    /**
     * Function create Bean -> mySqlConnector:
     * @return
     */
    @Bean("mySqlConnector")
    DatabaseConnector mysqlConfigure(){
        DatabaseConnector mySqlConnector = new MySQLConnector();
        mySqlConnector.setUrl("jdbc:mysql://host1:3306/xnxx_movie");

        return mySqlConnector;
    }

    @Bean("mongoDBConnector")
    DatabaseConnector mongoDBConfigure(){
        DatabaseConnector mongoDBConnector = new MongoDBConnector();
        mongoDBConnector.setUrl("jdbc:mongodb://host1:33061/loda");
        return mongoDBConnector;
    }

    @Bean("postgreSqlConnector")
    DatabaseConnector postgreSqlConfigure(){
        DatabaseConnector postgreConnector = new PostgreSqlConnector();
        postgreConnector.setUrl("jdbc:postxxx://host1:33060/loda");
        return postgreConnector;
    }

}
