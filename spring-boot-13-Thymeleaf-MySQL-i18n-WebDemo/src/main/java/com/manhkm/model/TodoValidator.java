package com.manhkm.model;

import org.thymeleaf.util.StringUtils;

import java.util.Optional;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 * ----
 * TodoValidator có tránh nhiệm xem một Object Todo là hợp lệ hay không?
 *
 */
public class TodoValidator {

    /**
     * isValid
     *      Optional.ofNullable
     *      filter
     *      isPersent.
     * @param todo
     * @return
     */
    public boolean isValid(Todo todo) {
        return Optional.ofNullable(todo)
                .filter(t -> !StringUtils.isEmpty(t.getTitle())) // Kiểm tra title khác rỗng
                .filter(t -> !StringUtils.isEmpty(t.getDetail())) // Kiểm tra detail khác rỗng
                .isPresent(); // Trả về true nếu hợp lệ, ngược lại false
    }
}
