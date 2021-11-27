package com.configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 */
@Configuration
public class AppConfig {

    /**
     * Khởi tạo một Bean -> SimpleBean
     * @return Object SimpleBean
     */
    @Bean("manhkm")
    SimpleBean simpleBeanConfigure(){
        return new SimpleBean("manhkm");
    }

    @Bean("ngocTrinh")
    @Primary
    SimpleBean getNgocTrinh(){
        return new SimpleBean("ngocTrinh");
    }
}
