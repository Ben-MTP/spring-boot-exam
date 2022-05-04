package com.core.test.controller;

import com.core.test.model.Todo;
import com.core.test.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ManhKM on 5/4/2022
 * @project spring-boot-18-Test-Spring-Boot
 */
@RestController
@RequestMapping("/api/v1")
public class TodoRestController {

    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    public List<Todo> findAll(){
        return todoService.getAll();
    }
}
