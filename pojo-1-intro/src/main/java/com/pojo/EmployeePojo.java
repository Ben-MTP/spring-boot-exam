package com.pojo;

import java.time.LocalDate;

/***
 * Author: ManhKM
 * Reference: https://shareprogramming.net/pojo-va-javabean-khac-nhau-nhu-the-nao/
 * Date: HN-07/08/2021
 */

public class EmployeePojo {
    /***
     * Không có quy tắc chuẩn cho việc đặt tên các thuộc tính, constructor, state class
     * Có thể dùng public -> protected -> default -> private đều được.
     * warning: Nó có thể gặp một số lỗi khi dùng trên một số framework.
     *
     */
    public String firstName;
    public String lastName;
    private LocalDate startDate;

    // create a constructor:
    public EmployeePojo(String firstName, String lastName, LocalDate startDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    // get fullName:
    public String getFullName(){
        return this.startDate + this.lastName;
    }

    // get localDate:
    public LocalDate getStart(){
        return this.startDate;
    }

    // get sayHello:
    public String sayHello(){
        System.out.println("Hello Everyone!");
        return "hello";
    }
}
