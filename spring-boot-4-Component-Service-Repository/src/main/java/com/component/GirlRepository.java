package com.component;

import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 */
public interface GirlRepository {

    /**
     * Tìm kiếm Object Girl có trong Database theo tên.
     * @param name
     * @return
     */
    Girl getGirlByName(String name);
}
