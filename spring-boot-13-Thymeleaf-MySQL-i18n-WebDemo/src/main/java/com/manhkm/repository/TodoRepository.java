package com.manhkm.repository;

import com.manhkm.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
