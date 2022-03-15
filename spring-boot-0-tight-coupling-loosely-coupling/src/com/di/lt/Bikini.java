package com.di.lt;

import com.di.lt.Outfit;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 */
public class Bikini implements Outfit{

    @Override
    public void wear() {
        System.out.println("Worn Bikini - Now");
    }
}
