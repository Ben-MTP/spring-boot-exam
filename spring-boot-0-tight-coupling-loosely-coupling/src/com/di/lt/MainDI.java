package com.di.lt;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 */
public class MainDI {
    public static void main(String[] args) {
        Outfit bikini = new Bikini();
        Girl tramAnh = new Girl(bikini);
        System.out.println(tramAnh.sayHello());
    }
}
