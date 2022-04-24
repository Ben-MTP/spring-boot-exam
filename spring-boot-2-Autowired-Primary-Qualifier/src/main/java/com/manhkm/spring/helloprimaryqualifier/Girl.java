package com.manhkm.spring.helloprimaryqualifier;

import com.manhkm.spring.helloprimaryqualifier.service.Outfit;
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
 *
 * --------
 * Cách sử dụng @Qualifier
 * Xác định chính xác tên của một Bean mà muốn chỉ định inject.
 * --------
 * Nếu không sử dụng @Autowied thì có thể dụng Constructor hoặc Setter để truyền Object tương ứng vào.
 */
@Component
public class Girl {

    /**
     * Case 2: Khi đi qua constructor không tham số.
     * Nó sẽ không Inject được giá trị
     * Vì không xác định được đâu là Bean cần tìm.
     */
    public Girl(){
        System.out.println(">>>> Đi qua constructor không tham số");
    }

    /**
     * Case 1: Sử dụng @Autowired cho instance
     * Không có constructor có tham số, chỉ có constructor mặc định.
     *
     */
    // @Autowired
    Outfit outfit;

    public Girl(@Qualifier("naked") Outfit outfit) {
        System.out.println(">>>> Đi qua constructor 1 tham số!!!");
        this.outfit = outfit;
    }

//    @Autowired
//    public void setOutfit(Outfit outfit) {
//        System.out.println(">>>> Đi qua method Setter của Outfit!!!");
//        this.outfit = outfit;
//    }

    public Outfit getOutfit() {
        return outfit;
    }
}
