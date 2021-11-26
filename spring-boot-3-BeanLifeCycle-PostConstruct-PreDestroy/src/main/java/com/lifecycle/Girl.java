package com.lifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * 1. create controller
 * 2. create PostConstructor
 * 3. create preDestroy
 */

@Component
public class Girl {

    // create postConstructor:
    @PostConstruct
    public void postConstructor(){
        System.out.println(">> Đối tượng Girl sau khi chạy hàm này xong sẽ khởi tạo");
    }

    // create controller:
    public Girl(){
        System.out.println(">> Đối tượng khởi tạo với Constructor!");
    }

    // create method preDestroy:
    @PreDestroy
    public void preDestroy(){
        System.out.println(">> Đối tượng Girl sẽ bị destroy sau khi chạy hàm này!");
    }
}
