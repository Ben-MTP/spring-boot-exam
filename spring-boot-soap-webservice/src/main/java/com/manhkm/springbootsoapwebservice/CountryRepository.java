package com.manhkm.springbootsoapwebservice;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ManhKM on 12/2/2021
 * @project spring-boot-soap-webservice
 */
@Component
public class CountryRespository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData(){
        // initialize countries map.
    }

    public Country findCountry(String name){
        return countries.get(name);
    }
}
