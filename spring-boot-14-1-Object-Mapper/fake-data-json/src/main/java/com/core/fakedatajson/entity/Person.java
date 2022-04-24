package com.core.fakedatajson.entity;

/**
 * @author ManhKM on 4/23/2022
 * @project fake-data-json
 */

public class Person {
    private String name;
    private String age;
    private String address;

    public Person() {
    }

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
