package com.configurationbean;

import com.configurationbean.service.impl.MongoDBConnector;
import com.configurationbean.service.impl.MySQLConnector;
import com.configurationbean.service.impl.PostgreSqlConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 * -----
 * Thực hiện việc gọi các Bean từ ApplicationContext thông qua việc sử dụng file Configuration.
 *      + Configuration
 *          + Bean -> Mỗi loại Bean sẽ là một kiểu Object trả về.
 */
@SpringBootApplication
public class AppDatabaseConnection {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppDatabaseConnection.class);

        /**
         * Lấy ra Bean phục vụ logic liên quan đến MySQL
         */
        MySQLConnector mySQLConnector = (MySQLConnector) context.getBean("mySqlConnector");
        mySQLConnector.connect();

        /**
         * Lấy ra Bean phục vụ logic của MongoDB
         */
        MongoDBConnector mongoDBConnector = (MongoDBConnector) context.getBean("mongoDBConnector");
        mongoDBConnector.connect();

        /**
         * Lấy ra Bean phục vụ logic của PostgreSQL
         */
        PostgreSqlConnector postgreSqlConnector = (PostgreSqlConnector) context.getBean("postgreSqlConnector");
        postgreSqlConnector.connect();
    }
}
