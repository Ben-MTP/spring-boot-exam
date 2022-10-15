package com.core.rest.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
@RestController
public class CRUDController {

    @GetMapping("/resource")
    public ArrayList<String> listResource(){
        return null;
    }

    @GetMapping("/resource/{id}")
    public String listResourceById(@PathVariable String id){
        return null;
    }

    @PostMapping("/resource")
    public String addResource(String resource){
        return null;
    }

    @PutMapping("/resource/{id}")
    public String editResource(String resource){
        return null;
    }

    @DeleteMapping("/resource/{id}")
    public boolean deleteResource(String id){
        return true;
    }
}
