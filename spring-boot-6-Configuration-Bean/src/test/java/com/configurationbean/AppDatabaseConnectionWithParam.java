package com.configurationbean;

import com.configurationbean.service.impl.MySQLConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 * -----
 * Thực hiện việc chạy với bean được cấu hình trong @Configuration + Bean
 * cùng với giá trị đầu vào cho việc tạo Bean.
 */
@SpringBootApplication
public class AppDatabaseConnectionWithParam {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppDatabaseConnectionWithParam.class);

        /**
         * Thực hiện việc gọi Bean từ file java code: @Configuration
         * ?? Thứ tự các bean có cần phải đặt theo FIFO không?
         */
        MySQLConnector mySQLConnector = (MySQLConnector) context.getBean("mySqlConnectionWithUser");
        mySQLConnector.connect();
    }
}
