package com.manhkm.controller;

import com.manhkm.services.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author ManhKM on 8/12/2021
 * @project spring-boot-exam
 */
@RestController
@RequestMapping("api/v1")
public class RestApiController {
    private List<Todo> todoList;

    @PostConstruct
    public void init(){
        todoList = IntStream.range(0, 10)
                .mapToObj(i -> new Todo("title-" + i, " detail-"+i))
                .collect(Collectors.toList());
    }

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId){
        return todoList.get(todoId);
    }

}
