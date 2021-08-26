package com.springboot.springboot10webtodothymeleaf.com.controller;

import com.springboot.springboot10webtodothymeleaf.com.service.Todo;
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

    List<Todo> todoList = new ArrayList<>();

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

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
