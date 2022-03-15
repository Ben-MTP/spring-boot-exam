package com.example.webservice.dto;

/**
 * @author ManhKM on 12/4/2021
 * @project spring-boot-rest-webservice-1
 */
public class NewDTO {
    private String  title;
    private String content;
    private String shortDescription;
    private String categoryCode;
    private String thumbnail;

    public NewDTO(){}

    public NewDTO(String title, String content, String shortDescription, String categoryCode, String thumbnail) {
        this.title = title;
        this.content = content;
        this.shortDescription = shortDescription;
        this.categoryCode = categoryCode;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
