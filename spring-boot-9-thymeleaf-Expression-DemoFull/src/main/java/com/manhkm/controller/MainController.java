package com.manhkm.controller;

import com.manhkm.entity.ProfileUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(Model model){
        List<ProfileUser> profile = new ArrayList<>();

        profile.add(new ProfileUser("name", "ManhKM"));
        profile.add(new ProfileUser("age", "18"));
        profile.add(new ProfileUser("address", "Ha Noi"));
        profile.add(new ProfileUser("phone", "0373553609"));

        model.addAttribute("profile", profile);

        return "show";
    }
}
