package com.core.fakedatajson.controller;

import com.core.fakedatajson.entity.Person;
import com.core.fakedatajson.services.IFakeService;
import com.core.fakedatajson.services.impl.FakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ManhKM on 4/23/2022
 * @project fake-data-json
 */
@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private IFakeService fakeService;

    @GetMapping("/person")
    public List<Person> getAllPerson(){
        return fakeService.fakeData();
    }
}
