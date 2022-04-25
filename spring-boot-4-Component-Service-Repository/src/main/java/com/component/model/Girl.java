package com.component.model;

/**
 * @author ManhKM on 11/26/2021
 * @project spring-boot-exam
 * -----
 * Định nghĩa Entity - Định nghĩa ra một Object Girl
 * Nên định nghĩa nó là một module -> hơn là một Entity
 *      Entity -> thực thể nào đó sử dụng đến với CSDL
 *      Model -> là cái gì đó chung chuyển giữa service-controller.
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
