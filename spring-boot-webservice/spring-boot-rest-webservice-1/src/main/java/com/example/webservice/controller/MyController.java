package com.example.webservice.controller;

import com.example.webservice.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 12/3/2021
 * @project spring-boot-rest-webservice-1
 */
@Controller
public class MyController {

    List<User> userList = new ArrayList<>();

    @RequestMapping(value = "/user/list", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseBody
    public User getUser(){

//        return new User(1, "ManhKM", 18, "Thái Bình");
        return null;
    }


    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    @ResponseBody
    public List<User> createUser(@RequestBody User user){
        System.out.println("Thêm mới một user vào List: " + user.getName());
        userList.add(user);
        return userList;
    }
}
