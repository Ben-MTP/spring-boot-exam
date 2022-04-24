package com.core.jdbc;

import com.core.jdbc.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.List;

@SpringBootApplication
public class UseJdbcWithSpringbootApplication implements CommandLineRunner {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(UseJdbcWithSpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //insertData();
        //insertDataUsingSimpleJdbcTemplate();
        //updateData();
        findOneById();
    }

    public void insertData(){
        String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(sql, "Effective Java", "ManhKM", 99.55f);

        if(result > 0){
            System.out.println("----> Insert successfully.");
        }
    }

    public void insertDataUsingSimpleJdbcTemplate(){
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("books");
        Book book = new Book("Effective Java", "ManhKM", 29.98f);
        BeanPropertySqlParameterSource paramSource = new BeanPropertySqlParameterSource(book);

        int result = insertActor.execute(paramSource);
        if(result > 0){
            System.out.println("-----> Insert successfully");
        }
    }

    public void updateData(){
        String sql = "UPDATE books SET price=? WHERE title=?";
        Object[] params = {99.99f, "Effective Java"};
        int result = jdbcTemplate.update(sql, params);
        if(result > 0){
            System.out.println("-----> Update successfully");
        }
    }

    public void delete(){
        String sql = "DELETE FROM books WHERE title=?";
        Object[] params = {"Effective Java"};
        int result = jdbcTemplate.update(sql, params);

        if(result > 0){
            System.out.println("-----> Delete successfully.");
        }
    }

    public void findAll(){
        String sql = "SELECT * FROM books";

        List<Book> listBooks = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Book.class));

        for (Book book : listBooks) {
            System.out.println(book);
        }
    }

    public void findOneById(){
        String sql = "SELECT * FROM books WHERE id = 1";
        Book book = jdbcTemplate.queryForObject(sql,
                BeanPropertyRowMapper.newInstance(Book.class));

        System.out.println(book);
    }
}
