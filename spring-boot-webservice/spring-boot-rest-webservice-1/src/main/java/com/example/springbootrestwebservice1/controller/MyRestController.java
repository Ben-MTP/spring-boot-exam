package com.example.springbootrestwebservice1.controller;

import com.example.springbootrestwebservice1.service.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 12/3/2021
 * @project spring-boot-rest-webservice-1
 */

@RestController
public class MyRestController {

    @GetMapping("/user/getList")
    public List<User> getUserList(){
        List<User> userList = new ArrayList<>();
//        userList.add(new User(1, "Khổng Minh Mạnh", 18, "Thái Bình"));
//        userList.add(new User(2, "Trần Thu Trang", 18, "Hà Nam"));
//        userList.add(new User(3, "Lê Việt Thắng", 18, "Vĩnh Phúc"));

        return userList;
    }
}
