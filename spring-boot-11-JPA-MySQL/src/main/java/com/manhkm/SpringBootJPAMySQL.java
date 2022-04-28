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

        /**
         * Lấy ra toàn bộ các data trong UserRepository
         */
        // userRepository.findAll().forEach(System.out::println);

        /**
         * Lưu một User mới có các thông tin kèm theo vào Database.
         */
        User user = userRepository.save(new User(999, 999, 999, 999, 999));

        System.out.println("User vừa lưu có ID: " + user.getId());

        /**
         * Lấy ra thông tin UserId của User mới được thêm vào trong Database:
         * User vừa lưu có ID: 104 -> số này có thể sẽ thay đổi trong mỗi lần gọi thực hiện lại chương trình.
         */
        Long userId = user.getId();

        /**
         * Điều chỉnh giá trị Agi thông quan method setAgi cho User đó.
         * Có thể thay đổi thành một giá trị bất kì -> @Data sẽ đảm nhiệm vai trò tạo các setter/getter cho chúng.
         */
        user.setAgi(100);

        /**
         * Thực hiện lưu lại giá trị đó vào lại trong Database.
         */
        userRepository.save(user);

        /**
         * Thực hiện khởi tạo user2 -> lấy theo giá trị id của User mới thêm vào.
         */
        User user2 = userRepository.findById(userId).get();
        System.out.println("User: " + user);
        System.out.println("User2: " + user2);

        /**
         * Thực hiện xóa một user có thông tin ở trong Database.
         * UserRepository -> chỉ mục đích là lấy ra các method có đã có, triển khai nó.
         * Để nó thực hiên các logic riêng.
         */
        userRepository.delete(user);

        /**
         * Lấy ra User3 đó, kiểm tra  xem nó có bị null nay không?
         * Nếu null thì user đó đã bị xóa khỏi Database.
         */
        User user3 = userRepository.findById(userId).orElse(null);
        System.out.println("User3: " + user3);
    }
}
