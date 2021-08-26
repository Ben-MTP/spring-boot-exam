package com.manhkm;

import com.manhkm.entity.User;
import com.manhkm.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
@RequiredArgsConstructor
public class SpringBootJPAMySQL {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJPAMySQL.class);
        System.out.println("SpringBoot JPA MySQL Running!");

        UserRepository userRepository = context.getBean(UserRepository.class);

        // get all user in database:
        userRepository.findAll().forEach(System.out::println);
        User user = userRepository.save(new User());

        System.out.println("User vừa lưu có ID: " + user.getId());
        Long userId = user.getId();

        user.setAgi(100);

        userRepository.save(user);

        User user2 = userRepository.findById(userId).get();
        System.out.println("User: " + user);
        System.out.println("User2: " + user2);

        // Delete User:
        userRepository.delete(user);

        // Show and check user:
        User user3 = userRepository.findById(userId).orElse(null);
        System.out.println("User3: " + user3);
    }
}
