package com.manhkm.spring.helloprimaryqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 11/24/2021
 * @project spring-boot-exam
 * Sử dụng @Autowired -> để inject một giá trị outfit vào khi khởi tạo đối tượng Girl.
 *      + Đánh dấu vào biến -> sẽ inject vào khi khởi tạo.
 *              -> KQ -> trả về OK
 *      + Đánh dấu vào method setter -> inject Bean bởi tham số của hàm.
 *              -> KQ -> trả về OK
 *      + Nếu không đánh dấu @Autowired vào thì sẽ không lấy ra được Out cho girl.
 *              -> Mục đích của việc autowired là tiêm Object vào cho một Object.
 */
@Component
public class Girl {


    private Outfit outfit;

    @Autowired
    public Girl(Outfit outfit){
        this.outfit = outfit;
    }

//    public void setOutfit(Outfit outfit) {
//        this.outfit = outfit;
//    }

    public Outfit getOutfit() {
        return outfit;
    }
}
