package com.core.json.model;

/**
 * @author ManhKM on 4/23/2022
 * @project convert-json-to-object
 */
public class ServiceModel {
    private String name;
    private String description;

    public ServiceModel(){}
    public ServiceModel(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ServiceModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
