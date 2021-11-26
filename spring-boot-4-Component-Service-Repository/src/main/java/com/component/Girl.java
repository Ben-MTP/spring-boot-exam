package com.component;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * Định nghĩa ra một Object Girl
 */
public class Girl {
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
