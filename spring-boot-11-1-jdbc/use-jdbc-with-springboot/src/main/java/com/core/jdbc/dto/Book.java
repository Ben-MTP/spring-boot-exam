package com.core.jdbc.dto;

/**
 * @author ManhKM on 4/23/2022
 * @project use-jdbc-with-springboot
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private float price;

    public Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    protected Book(){}

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
