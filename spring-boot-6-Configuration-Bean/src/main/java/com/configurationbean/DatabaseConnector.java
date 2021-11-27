package com.configurationbean;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 */
public abstract class DatabaseConnector {
    private String url;

    public abstract void connect();

    // setter-getter:
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
