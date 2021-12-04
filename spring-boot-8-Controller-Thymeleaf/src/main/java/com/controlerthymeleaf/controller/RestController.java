package com.controlerthymeleaf.controller;

import org.springframework.stereotype.Controller;

import com.controlerthymeleaf.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ManhKM on 12/3/2021
 * @project spring-boot-exam
 */
@Controller
public class RestController {

    @RequestMapping("user/list")
    @ResponseBody
    public User getUser(){

        return new User(1, "ManhKM", 18, "Thai Binh");
    }
}
