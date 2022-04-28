package com.manhkm.config;

import com.manhkm.model.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 * -----
 * Mong muốn tự tạo ra một Bean TodoVaidator
 * Lúc này sử dụng @Configuration + @Bean để quản lý.
 */
@Configuration
public class TodoConfig {

    @Bean
    public TodoValidator validator(){
        return new TodoValidator();
    }
}
