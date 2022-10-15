package com.core.rest.entity;

/**
 * @author ManhKM on 10/15/2022
 * @project spring-boot-RESTful-Web-Services
 */
public class Product {
    private int id;
    private String name;
    private float price;

    public Product(){
        this.id = 0;
        this.name = "";
        this.price = 0f;
    }

    public Product(int id, String name, float price){
        this.id     = id;
        this.name   = name;
        this.price  = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
