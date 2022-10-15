package com.core.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello(){
    return "Hello World RESTful with Spring Boot";
  }

  @RequestMapping(value = {
      "/hello-path",
      "/hello-path/{name}/{age}/{address}",
      "/hello-path/{name}/{age}",
      "/hello-path/{name}"
  })
  public String helloPath(@PathVariable(required = false) String name, @PathVariable(required = false) String age, @PathVariable(required = false) String address){
    return "Hello, name: " + name + ", age: " + age + ", address: " + address;
  }

  @RequestMapping("/hello-name")
  public String helloWithName(@RequestParam(name = "name", defaultValue = "World ") String name){
    return "Hello " + name;
  }
}
