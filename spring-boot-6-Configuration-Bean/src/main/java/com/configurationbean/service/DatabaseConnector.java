package com.configurationbean.service;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 * -----
 * Khởi tạo Object DatabaseConnector
 *      + Thực hiện việc connect và lấy thông tin của url.
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
