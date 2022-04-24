package com.manhkm.spring.helloprimaryqualifier.service.impl;

import com.manhkm.spring.helloprimaryqualifier.service.Outfit;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 4/23/2022
 * @project spring-boot-2-Autowired-Primary-Qualifier
 */
@Component("naked")
public class Naked implements Outfit {

    @Override
    public void wear() {
        System.out.println("Đang không mặc gì cả");
    }
}
