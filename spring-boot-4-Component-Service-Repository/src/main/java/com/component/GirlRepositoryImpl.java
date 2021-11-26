package com.component;

import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */
@Repository
public class GirlRepositoryImpl implements GirlRepository{

    /**
     * Method trả về Object Girl
     * @param name
     * @return
     */
    @Override
    public Girl getGirlByName(String name) {
        /**
         * Query in CSDL -> get Database with name = name.
         */
        return new Girl(name);
    }
}
