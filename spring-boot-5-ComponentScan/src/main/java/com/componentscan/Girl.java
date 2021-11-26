package com.componentscan;

import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */
@Component
public class Girl {
    private String name;

    public Girl(){}

    public Girl(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name: " + name;
    }
}
