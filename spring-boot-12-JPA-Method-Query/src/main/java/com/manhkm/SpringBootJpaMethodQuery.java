package com.manhkm;

import com.manhkm.entity.User;
import com.manhkm.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@SpringBootApplication
public class SpringBootJpaMethodQuery {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJpaMethodQuery.class);

        System.out.println("Spring Boot JPA Method Query Running!");

        UserRepository userRepository = context.getBean(UserRepository.class);

        System.out.println("Tìm user với Agi trong khoảng 25-30: ");
        System.out.println("findAllByAgiBetween: ");
        userRepository.findAllByAgiBetween(25, 30).forEach(System.out::println);
        System.out.println("===========================================");
        System.out.println("Tìm user với Agi trong lớn hơn 97");
        System.out.println("findAllByAgiGreaterThan: ");
        userRepository.findAllByAgiGreaterThan(97)
                .forEach(System.out::println);

        // Tìm kiếm tất cả theo Atk = 74
        System.out.println("===========================================");
        System.out.println("Tìm user với Atk = 74");
        System.out.println("findAllByAtk: ");
        userRepository.findAllByAtk(74)
                .forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Tìm User với def = 49");
        System.out.println("SELECT u FROM User u WHERE u.def = :def");
        User user = userRepository.findUserByDefQuery(49);
        System.out.println("User: " + user);

    }
}
