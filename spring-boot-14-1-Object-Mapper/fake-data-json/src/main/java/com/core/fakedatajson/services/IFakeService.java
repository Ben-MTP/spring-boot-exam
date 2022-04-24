package com.core.fakedatajson.services;

import com.core.fakedatajson.entity.Person;

import java.util.List;

/**
 * @author ManhKM on 4/23/2022
 * @project fake-data-json
 */
public interface IFakeService {
    List<Person> fakeData();
}
