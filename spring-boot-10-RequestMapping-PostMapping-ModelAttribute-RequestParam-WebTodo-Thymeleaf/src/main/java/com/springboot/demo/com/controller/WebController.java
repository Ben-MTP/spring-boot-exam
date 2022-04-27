package com.springboot.demo.com.controller;

import com.springboot.demo.com.entity.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 8/26/2021
 * @project spring-boot-exam
 * Note: java thread
 */
@Controller
public class WebController {

    /**
     * Sử dụng tạm List để chứa danh sách các công việc
     * Cái chính vẫn phải lấy từ Database lên -> lưu trữ xuống Database.
     * Cách này chỉ dùng làm DEMO.
     */
    List<Todo> todoList = new ArrayList<>();

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    /**
     * @RequestParam dùng để đánh dấu một biến là request param trong request gửi lên server.
     * Nó sẽ gán dữ liệu của param-name tương ứng vào biến
     * Ví dụ: http://localhost:8080/listTodo?limit=2
     *      thì ?limit=2 là RequestParam
     *      SpringBoot sẽ tự xử lý và gán số 2 vào biến Integer limit hộ chúng ta.
     *      Nếu chúng ta không gửi lên thì limit sẽ là null.
     *
     */
    @GetMapping("/listTodo")
    public String index(Model model, @RequestParam(value = "limit", required = false) Integer limit){
        if(limit != null){
            model.addAttribute("todoList", todoList.subList(0, limit));
        } else{
            model.addAttribute("todoList", todoList);
        }
        return "listTodo";
    }

    @RequestMapping(value = "/addTodo", method = RequestMethod.GET)
    public String addTodo(Model model){

        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @RequestMapping(value = "/addTodo", method = RequestMethod.POST)
    public String addTodo(@ModelAttribute Todo todo){
        todoList.add(todo);
        return "success";
    }
}
