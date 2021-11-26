package com.componentscan.others;

import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */
@Component
public class OtherGirl {
    private String name;

    public OtherGirl(){

    }

    public OtherGirl(String name){
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
        return "name: " + name;
    }
}
