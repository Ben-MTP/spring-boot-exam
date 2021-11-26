package com.component;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    public Girl getRandomGirl(){
        String name = ramdomGirlName(10);

        return girlRepository.getGirlByName(name);
    }

    private String ramdomGirlName(int length) {
        return RandomStringUtils.randomAlphabetic(length).toUpperCase();
    }
}
