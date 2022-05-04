package com.core.test.repository;

import com.core.test.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-boot-18-Test-Spring-Boot
 */
@Repository
public interface TodoRepository {
    List<Todo> findAll();

    Todo findById(int id);
}
