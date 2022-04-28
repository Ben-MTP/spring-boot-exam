package com.manhkm.controller;

import com.manhkm.model.Todo;
import com.manhkm.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 * -----
 * Tầng controller nơi đón nhận các request từ phía người dùng.
 * và chuyển tiếp luồng xử lý xuống tầng Service.
 */
@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    /**
     * @RequestParam dùng để đánh dấu một biến là request param -> limit.
     *      required -> false -> không yêu cầu phải bắt buộc truyền vào.
     * Biến này tiếp nhận thông qua request Get và gửi lên Server.
     *
     */
    @GetMapping("/listTodo")
    public String index(Model model, @RequestParam(value = "limit", required = false) Integer limit) {
        /**
         * Trả về đối tượng todoList.
         */
        model.addAttribute("todoList", todoService.findAll(limit));
        // Trả về template "listTodo.html"
        return "listTodo";
    }

    @GetMapping("/addTodo")
    public String addTodo(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @PostMapping("/addTodo")
    public String addTodo(@ModelAttribute Todo todo) {
        return Optional.ofNullable(todoService.add(todo))
                .map(t -> "success") // Trả về success nếu save thành công
                .orElse("failed"); // Trả về failed nếu không thành công

    }
}
