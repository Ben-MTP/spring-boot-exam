package com.example.springboot81controllerthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-8-1-Controller-Thymeleaf
 */
@Controller
public class MyController {

    @GetMapping("/")
    public String getIndex(){
        System.out.println("Call method getIndex()");
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }


    @GetMapping("/hello")
    public String sayHello(
            @RequestParam(name="username", required = false, defaultValue = "") String username, Model model){
        System.out.println("Call method sayHello()");
        model.addAttribute("username", username);
        return "hello";
    }
}
