package com.manhkm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }


    @RequestMapping(value = "/information", method = RequestMethod.GET)
    public String info(
            @RequestParam(name="name",required = false,defaultValue = "") String name,
            @RequestParam(name="age",required = false,defaultValue = "") String age,
            @RequestParam(name="address",required = false,defaultValue = "") String address,
            Model model
    ){
        model.addAttribute("ten", name);
        model.addAttribute("tuoi", age);
        model.addAttribute("diachi", address);

        return "information";
    }

}
