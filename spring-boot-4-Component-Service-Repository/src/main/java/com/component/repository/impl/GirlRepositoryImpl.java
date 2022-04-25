package com.component.repository.impl;

import com.component.model.Girl;
import com.component.repository.GirlRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * Định nghĩa về cách sử dụng của @Repository
 */
@Repository
public class GirlRepositoryImpl implements GirlRepository {

    @Override
    public Girl getGirlByName(String name) {
        /**
         * Query in CSDL -> get Database with name = name.
         * Giả định Database trả về một dữ liệu trùng với dữ liệu truyền vào
         */
        String data = name + "-from-database";
        return new Girl(data);
    }
}
