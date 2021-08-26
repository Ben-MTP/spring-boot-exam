package com.manhkm.controller;

import com.manhkm.services.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author ManhKM on 8/11/2021
 * @project spring-boot-exam
 */
@RestController
@RequestMapping("/api/v1")
public class RestApiController {
    /**
     * Khởi tạo List -> dùng cho việc lưu trữ dữ liệu Todo.
     */
    private List<Todo> todoList = new ArrayList<>();

    @PostConstruct
    public void init(){
        todoList.add(null);
    }

    @GetMapping("/todo")
    public List<Todo> getTodoList(){
        return todoList;
    }

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId){
        return todoList.get(todoId);
    }

    /**
     * Dùng cho việc sửa dữ liệu:
     */
    @PutMapping("/todo/{todoId}")
    public Todo editTodo(@PathVariable(name = "todoId") Integer todoId, @RequestBody Todo todo){
        todoList.set(todoId, todo);
        return todo;
    }

    @DeleteMapping("/todo/{todoId}")
    public ResponseEntity deleteTodo(@PathVariable(name = "todoId") Integer todoId){
        todoList.remove(todoId.intValue());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/todo")
    public ResponseEntity addTodo(@RequestBody Todo todo){
        todoList.add(todo);
        return ResponseEntity.ok().body(todo);
    }

}
