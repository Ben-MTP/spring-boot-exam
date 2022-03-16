package com.manhkm.spring.helloprimaryqualifier.service.impl;

import com.manhkm.spring.helloprimaryqualifier.service.Outfit;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/24/2021
 * @project spring-boot-exam
 */
@Component
public class Short implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mac Short");
    }
}
