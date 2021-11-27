package com.configurationbean;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
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
