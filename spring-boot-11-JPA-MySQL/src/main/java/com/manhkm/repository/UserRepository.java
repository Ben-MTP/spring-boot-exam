package com.manhkm.repository;

import com.manhkm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
