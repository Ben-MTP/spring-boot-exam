package com.core.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Đóng gói một Bean chạy theo kiểu CommandLineRunner
 * Khi chạy thì sẽ chạy vào Bean này
 */
@SpringBootApplication
public class App {

  @Autowired
  MyHouse myHouse;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Bean
  CommandLineRunner run(){
    return args -> {
      Thread.currentThread().setName("Dog-Event-Listener");
      System.out.println(Thread.currentThread().getName() + ": ManhKM đi tới của nhà");
      System.out.println(Thread.currentThread().getName() + ": => ManhKM bấm chuông và khai báo họ tên");

      // Gõ cửa:
      myHouse.rangDoorbellBy("ManhKM");
      System.out.println(Thread.currentThread().getName() + ": ManhKM quay lưng bỏ đi");
    };
  }
}
