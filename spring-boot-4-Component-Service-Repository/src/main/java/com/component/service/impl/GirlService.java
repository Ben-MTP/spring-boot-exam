package com.component.service.impl;

import com.component.entity.Girl;
import com.component.repository.GirlRepository;
import com.component.service.IGirlService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */
@Service
public class GirlService implements IGirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Override
    public Girl getRandomGirl(){
        String name = ramdomGirlName(10);

        return girlRepository.getGirlByName(name);
    }

    @Override
    public String ramdomGirlName(int length) {
        return RandomStringUtils.randomAlphabetic(length).toUpperCase();
    }
}
