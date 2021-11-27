package com.configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
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
