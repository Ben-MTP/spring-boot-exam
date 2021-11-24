package com.manhkm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/***
 * @Autowired đánh dấu cho Spring biết rằng sẽ tự động inject bean tương ứng vào vị trí được đánh dấu
 * Trong trường hợp này -> Outfit -> sẽ tìm được 2 Component tương ứng -> và không xác định rõ là đang muốn dùng Component nào.
 *
 * Giải pháp: Có 2 cách triển khai.
 * 1. @Qualifier().
 *       - Xác định tên của một Bean mà bạn muốn chỉ định inject
 * 2. @Primary()
 *       - Cách dùng chỉ cần đặt vào trong Component chính.
 */
@Component
public class Girl {

    @Qualifier("aoDai")
    @Autowired
    private Outfit outfit;

    public Girl(@Qualifier("aoDai") Outfit outfit){
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }
}
