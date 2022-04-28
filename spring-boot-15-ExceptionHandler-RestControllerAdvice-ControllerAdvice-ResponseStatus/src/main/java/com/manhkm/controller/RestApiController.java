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
 * -----
 * @RequestMapping ở class, sẽ tác động đến tất cả các RequestMapping ở các phương thức.
 * Khi đó mọi request ở trong method sẽ được gán thêm prefix: api/v1
 */

@RestController
@RequestMapping("api/v1")
public class RestApiController {

    private List<Todo> todoList;

    /**
     * PostContruct -> thực thiện call trước khi gọi đến constructor của Object
     *  IntStream
     *  mapToObject
     *  collect...
     *  Thực hiện khởi tạo 0 -> 10 đối tượng và đưa chúng vào trong một ListTodo.
     */
    @PostConstruct
    public void init(){
        todoList = IntStream.range(0, 10)
                .mapToObj(i -> new Todo("title-" + i, " detail-"+i))
                .collect(Collectors.toList());
    }

    /**
     * URL path muốn lấy thông tin xuống api thì sẽ được đặt trong dấu {}
     */
    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId){
        return todoList.get(todoId);
    }

}
