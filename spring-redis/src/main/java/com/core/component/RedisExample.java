package com.core.component;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 8/5/2022
 * @project spring-redis
 */
@Component
public class RedisExample implements CommandLineRunner {

  @Autowired
  private RedisTemplate template;

  @Override
  public void run(String... args) throws Exception {
    listExample();
  }

  public void valueExample(){
    // Set giá trị của key "loda" là "hello redis"
    template.opsForValue().set("loda","hello world");

    // In ra màn hình Giá trị của key "loda" trong Redis
    System.out.println("Value of key loda: "+template.opsForValue().get("loda"));
  }

  private void listExample() {
    List<String> list = new ArrayList<>();

    list.add("ManhKM");
    list.add("Redis");

    template.opsForList().rightPushAll("loda_list", list);

    System.out.println("Size of key loda: "+template.opsForList().size("loda_list"));

  }
}
