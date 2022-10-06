package com.core.security.repository;

import com.core.security.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 10/6/2022
 * @project spring-security-hibernate-jwt
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);
}
