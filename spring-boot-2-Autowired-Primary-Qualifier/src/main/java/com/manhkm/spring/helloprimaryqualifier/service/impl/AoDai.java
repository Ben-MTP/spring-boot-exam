package com.manhkm.spring.helloprimaryqualifier.service.impl;

import com.manhkm.spring.helloprimaryqualifier.service.Outfit;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/24/2021
 * @project spring-boot-exam
 * Cách sử dụng của @Primary
 *      Đánh dấu trên một Bean.
 *      Giúp nó luôn ưu tiên lựa chọn trong trường hợp có nhiều Bean cùng loại.
 */
@Component("aodai")
@Primary
public class AoDai implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mac ao dai");
    }
}
