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
 * -----
 * Sử dụng tính năng basic cho RestController -> nên tạm thời bỏ qua việc connection đến Database.
 * Tập trung vào 2 annotation: @RequestMapping and @PostConstructor
 *
 */
@RestController
@RequestMapping("/api/v1")
public class RestApiController {
    /**
     * Khởi tạo List -> dùng cho việc lưu trữ dữ liệu Todo.
     * Hiện không sử dụng đến Database nên con List như một nơi để lưu các model cần dùng.
     */
    private List<Todo> todoList = new ArrayList<>();

    @PostConstruct
    public void init(){
        /**
         * Khởi tạo giá trị ban đầu cho List Todo là null.
         * Tại sao lại như vậy? Mục đích thêm giá trị null để bỏ qua vị trí số 0.
         */
        todoList.add(null);
        todoList.add(new Todo("SpringBoot", "RESTful API"));
    }

    @GetMapping("/")
    public String sayHello(){
        return "Spring Boot - RESTful API v1.0";
    }

    /**
     * Lấy toàn bộ giá trị trong model -> ở đây tạm coi là là một List các To-do.
     */
    @GetMapping("/todo")
    public List<Todo> getTodoList(){
        return todoList;
    }

    /**
     * Mục đích lấy ra thông tin của Todo theo giá trị todoId truyền vào qua url.
     * @PathVariable dùng để lấy ra giá trị trong url.
     *  dựa vào tên của thuộc tính đã được định nghĩa trong ngoặc kép: /todo/{todoId}.
     * @GetMapping -> sử dụng với HTTP Method Get.
     */
    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId){
        return todoList.get(todoId);
    }

    /**
     * Dùng cho việc sửa dữ liệu
     * @RequestBody sẽ làm nhiệm vụ chuyển đổi JSON Data/RequestBdoy -> thành một Java Object.
     * @PathVariable sẽ làm nhiệm vụ lấy ra giá trị trên url.
     * @PutMapping định nghĩa rằng API này sẽ sử dụng HTTP Put method.
     * ---
     * Thực hiện lấy Object todo đó set vào vị trị todoId trong List.
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

    /**
     * Thực hiện việc thêm mới dữ liệu
     * ResponseEntity sẽ dùng để định nghĩa lại Response trả về.
     * Trả về response STATUS CODE = 200.
     * Body sẽ chứa thông tin về đối tượng Todo vừa được tạo.
     */
    @PostMapping("/todo")
    public ResponseEntity addTodo(@RequestBody Todo todo){
        todoList.add(todo);
        return ResponseEntity.ok().body(todo);
    }

    /**
     * Lấy thông tin user trả về một chuỗi JSON bằng request:
     */

}
