package com.configurationbean.entity;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 * ---
 * Tạo một class cơ bản, không sử dụng @Component.
 * Định nghĩa đây sẽ là một Object cơ POJO dùng cho logic nào đó.
 *      Có thể là Bean hoặc cái khác.
 *
 */
public class SimpleBean {

    private String username;

    public SimpleBean(){}
    public SimpleBean(String username) {
        this.username = username;
    }

    // setter-getter:
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // toString:
    @Override
    public String toString() {
        return "SimpleBean{" +
                "username='" + username + '\'' +
                '}';
    }
}
