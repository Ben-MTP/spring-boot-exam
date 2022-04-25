package com.component.service.impl;

import com.component.model.Girl;
import com.component.repository.GirlRepository;
import com.component.repository.impl.GirlRepositoryImpl;
import com.component.service.IGirlService;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * -----
 * Triển khai Interface: GirlService
 */
@Service
public class GirlService implements IGirlService {

    /**
     * Ở bước này: XXXRepository sẽ được inject vào Service thông qua annotation: autowire.
     * Trước đó: GirlRepository đã được Container quản lý thông qua: Annotation: @Repository.
     * -----
     * Nếu không sử dụng @Autowired
     *      Thì phải sử dụng:
     *          private GirlRepository girlRepository = new GirlRepositoryImpl();
     */
    @Autowired
    private GirlRepository girlRepository;

    @Override
    public Girl getRandomGirl(){
        String name = ramdomGirlName(10);

        return girlRepository.getGirlByName(name);
    }

    /**
     * Thực hiện logic ramdom ra một cái tên bất kì nào đó.
     * @param length
     * @return
     */
    @Override
    public String ramdomGirlName(int length) {
        return RandomStringUtils.randomAlphabetic(length).toUpperCase();
    }
}
