package com.manhkm.spring.helloprimaryqualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/24/2021
 * @project spring-boot-exam
 * Sử dụng Primary -> để đánh dấu đây là Bean cần ưu tiên hơn.
 */
@Component
@Primary
public class AoDai implements Outfit{
    @Override
    public void wear() {
        System.out.println("Mac ao dai");
    }
}
