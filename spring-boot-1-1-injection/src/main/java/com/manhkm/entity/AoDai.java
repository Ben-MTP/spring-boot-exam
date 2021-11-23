package com.manhkm.entity;

import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/23/2021
 * @project spring-boot-exam
 */
@Component("aoDai")
public class AoDai implements Outfit{
    @Override
    public void wear() {
        System.out.println("Mặc áo dài");
    }
}
