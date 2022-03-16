package com.manhkm;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Triển khai Class Bikini kế thừa từ Outfit.
 * Và đánh đấu nó là một Bean (hoặc dependency) để IoC tìm ra nó và quản lý nó.
 * Mặc định cơ chế trong Container -> quản lý Singleton.
 * ---
 * Mỗi lần khởi tạo Bean này sẽ tạo ra một giá trị Bean khác nhau
 *      -> nó không phải là duy nhất. Vì để theo cơ chế của prototype.
 */
@Component
@Scope("prototype")
public class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Worn Bikini!");
    }
}
