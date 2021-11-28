package com.example.springboot9thymeleafexpressiondemofull;

/**
 * @author ManhKM on 11/28/2021
 * @project spring-boot-9-Thymeleaf-Expression-DemoFull
 */
public class Info {
    private String key;
    private String value;

    public Info(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
