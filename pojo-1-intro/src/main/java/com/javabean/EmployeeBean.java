package com.javabean;

import java.time.LocalDate;

public class EmployeeBean {
    private String firstName;
    private String lastName;
    private LocalDate startDate;

    // Constructor default:
    public EmployeeBean(){}

    // Constructor have 3 args:
    public EmployeeBean(String firstName, String lastName, LocalDate startDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    // GETTER/SETTER:


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
