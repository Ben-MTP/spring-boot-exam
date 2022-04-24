package com.mkyong;

import com.mkyong.services.CustomerService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ManhKM on 4/24/2022
 * @project spring-boot-3-BeanLifeCycle-PostConstruct-PreDestroy
 * -----
 * 1. ConfigurableApplicationContext là gì?
 * 2. ClassPathXmlApplicationContext là gì?
 *      + context.getBean
 *
 */
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Spring-Customer.xml"});
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        System.out.println(customerService);
        context.close();
    }
}
