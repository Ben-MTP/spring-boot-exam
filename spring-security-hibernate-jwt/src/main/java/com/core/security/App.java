package com.core.security;

import com.core.security.user.User;
import com.core.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class App implements CommandLineRunner {

  @Autowired
  UserRepository userRepository;

  @Autowired
  PasswordEncoder passwordEncoder;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    System.out.println("SERVER_IS_STARTED");
  }

  @Override
  public void run(String... args) throws Exception {
    // Khi chạy tiến trình:
    // Insert vào CSDL một User:
    User user = new User();
    user.setId(1L);
    user.setUsername("manhkm");
    user.setPassword(passwordEncoder.encode("manhkm"));
    userRepository.save(user);
    System.out.println(user);
  }

}
