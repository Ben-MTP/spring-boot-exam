package com.manhkm;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 3/16/2022
 * @project spring-boot-1-Component-Autowired
 *
 * Mỗi lần khởi tạo đến Bean này, hay chỉ đơn giản là gọi bean này ra -> nó sẽ chỉ tạo ra một Bean duy nhất
 *      -> Theo cơ chế: singleton.
 */
@Component
@Scope("singleton")
public class Earring implements Accessory{
    @Override
    public void push() {
        System.out.println("Pushed Earring in your ear!");
    }
}
