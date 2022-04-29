package com.core.manhkm.config;

import com.core.manhkm.model.LocalDatasource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author ManhKM on 4/29/2022
 * @project spring-boot-17-Runtime-Spring-Profile
 */
@Configuration
@Profile("local")
public class LocalDatasourceConfig {

    @Bean
    public LocalDatasource localDatasource(){
        return new LocalDatasource("Local object, Chỉ khởi tạo khi 'local' profile active");
    }
}
