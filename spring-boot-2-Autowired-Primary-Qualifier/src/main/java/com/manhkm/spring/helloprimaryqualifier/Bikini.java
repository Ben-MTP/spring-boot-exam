package com.manhkm.spring.helloprimaryqualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/24/2021
 * @project spring-boot-exam
 */
@Component
//@Primary
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Mac bikini");
    }
}
