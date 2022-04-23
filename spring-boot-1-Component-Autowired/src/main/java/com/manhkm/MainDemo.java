package com.manhkm;

import com.manhkm.service.Accessory;
import com.manhkm.service.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Điểm chỉ ra đâu là nơi bắt đầu cho Project chạy.
 * Để nó thực hiện bắt đầu mọi thứ.
 *      -> Annotation: @SpringBootApplication -> là để đánh dấu.
 *      -> SpringApplication.run(....) -> là để thực hiện chạy.
 *
 * ---
 * Nhiệm vụ của Spring Framework
 *      -> tạo ra một Container chứa các Dependency cần dùng.
 *      -> .run(...) chính là tạo container.
 *      -> sau đó đặt tên container: ApplicationContext.
 *      -> đặt tên các dependency: Bean.
 */
@SpringBootApplication
public class MainDemo {
    public static void main(String[] args) {
        /**
         * Khởi tạo một Container và đặt trên nó là context.
         */
        ApplicationContext context = SpringApplication.run(MainDemo.class, args);

        /**
         * Lấy ra một bean mà nó đã được đánh dấu.
         * Nó đang được quản lý bởi Context
         */
        Outfit outfit = context.getBean(Outfit.class);
        Accessory accessory = context.getBean(Accessory.class);

        System.out.println("Instance outfit: " + outfit);
        System.out.println("Instance accessory: " + accessory);

        Girl girl = context.getBean(Girl.class);
        System.out.println("Girl Instance: " + girl);
        System.out.println("Girl Outfit: " + girl.outfit);      //prototype
        System.out.println("Girl accessory: " + girl.accessory);

        /**
         * Thực hiện 2 động tác trên Girl
         *      1. Mặc
         *      2. Đeo
         *
         * Instance outfit: com.manhkm.service.impl.Bikini@2427e004
         * Instance accessory: com.manhkm.service.impl.Earring@5ebd56e9
         * Girl Instance: com.manhkm.Girl@63f34b70
         * Girl Outfit: com.manhkm.service.impl.Bikini@641856
         * Girl accessory: com.manhkm.service.impl.Earring@5ebd56e9
         * Worn Bikini!
         * Pushed Earring in your ear!
         */
        girl.outfit.wear();
        girl.accessory.push();
    }
}
