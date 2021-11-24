package com.manhkm.entity;

import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mặc bikini");
    }
}
