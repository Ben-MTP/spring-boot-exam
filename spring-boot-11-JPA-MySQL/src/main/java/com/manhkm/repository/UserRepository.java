package com.manhkm.repository;

import com.manhkm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 * -----
 * Sử dụng UserRepository -> cho nó kế thừa lại Interface: JpaRepository
 *      Mặc định nó sẽ sử dụng được các method trong JpaRepsitory mà không cần phải triển khai lại nó.
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
