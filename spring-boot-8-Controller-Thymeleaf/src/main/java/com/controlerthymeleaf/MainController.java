package com.controlerthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-exam
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }
}