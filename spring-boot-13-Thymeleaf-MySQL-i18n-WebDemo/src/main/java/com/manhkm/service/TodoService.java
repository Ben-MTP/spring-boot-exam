package com.manhkm.service;

import com.manhkm.model.Todo;
import com.manhkm.model.TodoValidator;
import com.manhkm.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoValidator validator;

    public List<Todo> findAll(Integer limit) {
        return Optional.ofNullable(limit)
                .map(value -> todoRepository.findAll(PageRequest.of(0, value)).getContent())
                .orElseGet(() -> todoRepository.findAll());
    }

    public Todo add(Todo todo) {
        if (validator.isValid(todo)) {
            return todoRepository.save(todo);
        }
        return null;
    }
}
