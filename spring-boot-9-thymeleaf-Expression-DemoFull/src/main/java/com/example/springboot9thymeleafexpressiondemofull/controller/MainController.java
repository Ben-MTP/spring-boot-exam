package com.example.springboot9thymeleafexpressiondemofull.controller;

import com.example.springboot9thymeleafexpressiondemofull.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-9-Thymeleaf-Expression-DemoFull
 */
@Controller
public class MainController {

    //getIndex:
    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    //getProfile:
    @GetMapping("/profile")
    public String profile(Model model){

        List<Info> profile = new ArrayList<>();
        profile.add(new Info("fullname", "ManhKM"));
        profile.add(new Info("nickname", "Manh"));

        model.addAttribute("profile", profile);

        return "profile";
    }
}
