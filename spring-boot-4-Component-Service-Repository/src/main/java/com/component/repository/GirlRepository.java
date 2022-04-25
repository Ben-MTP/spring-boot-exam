package com.component.repository;

import com.component.model.Girl;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * -----
 * Repository
 *  Đảm nhiệm nọi chức năng giao tiếp với Database.
 *  Mục đích: Đảm bảo tính liên kết lỏng lẻo giữa các module.
 */
public interface GirlRepository {

    /**
     * Tìm kiếm Object Girl có trong Database theo tên.
     * @param name
     * @return
     */
    Girl getGirlByName(String name);
}
