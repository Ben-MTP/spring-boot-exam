## How to use JDBC with Spring Boot

## 1. Create database:
    CREATE TABLE `books` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `title` varchar(45) NOT NULL,
    `author` varchar(45) NOT NULL,
    `price` float NOT NULL,
    PRIMARY KEY (`id`)
    );

## 2. JdbcTemplate - how to use

## Reference Document
    https://codejava.net/frameworks/spring-boot/how-to-use-jdbc-with-spring-boot?fbclid=IwAR3wiz8tekrVTzS9n_zX8u8uVc9p-NaD4SyiXb22PLqHw8en6oeX0Bto86c
