package com.core.eventlistener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author ManhKM on 10/10/2022
 * @project spring-boot-EventListener-Async
 */
@Configuration
@EnableAsync
public class ListenerConfiguration {

    @Bean
    TaskExecutor taskExecutor(){
        return new SimpleAsyncTaskExecutor();
    }
}
