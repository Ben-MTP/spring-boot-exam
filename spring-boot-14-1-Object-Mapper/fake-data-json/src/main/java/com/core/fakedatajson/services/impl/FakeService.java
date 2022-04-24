package com.core.fakedatajson.services.impl;

import com.core.fakedatajson.entity.Person;
import com.core.fakedatajson.services.IFakeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM on 4/23/2022
 * @project fake-data-json
 */
@Service
public class FakeService implements IFakeService {

    @Override
    public List<Person> fakeData(){

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));
        personList.add(new Person("manhkm", "19", "Hà Nội"));

        return personList;
    }
}
