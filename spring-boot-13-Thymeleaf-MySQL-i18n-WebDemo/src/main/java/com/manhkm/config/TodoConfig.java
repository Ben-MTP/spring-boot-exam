package com.manhkm.config;

import com.manhkm.model.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@Configuration
public class TodoConfig {

    @Bean
    public TodoValidator validator(){
        return new TodoValidator();
    }
}
