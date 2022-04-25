package com.applicationconfig.services;

/**
 * @author ManhKM on 11/27/2021
 * @project spring-boot-exam
 * -----
 * DatabaseConnector có nhiệm vụ kết nối tới Database.
 */
public abstract class DatabaseConnector {
    private String url;

    /**
     * Thực hiện connect đến một Database bất kỳ.
     * Mở connection...
     */
    public abstract void connect();

    // setter-getter:
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
