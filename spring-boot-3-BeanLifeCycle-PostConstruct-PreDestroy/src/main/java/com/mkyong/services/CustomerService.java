package com.mkyong.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ManhKM on 4/24/2022
 * @project spring-boot-3-BeanLifeCycle-PostConstruct-PreDestroy
 */
public class CustomerService {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void initIt(){
        System.out.println("Init method after properties are set: " + message);
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Spring Container is destroy! Customer clean up...");
    }
}
