package com.manhkm;

import com.manhkm.service.Accessory;
import com.manhkm.service.Outfit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Component
 * Là một Annotation (chú thích) đánh dấu trên các Class để
 *      Spring biết nó là một Bean.
 *
 * ----
 * Sử dụng @Autowired -> tự động Injection Bean khi cần sử dụng.
 *      Bean ở đây là khái niệm một hạt đậu bên trong Container. IoC Quản lý.
 */
@Component
public class Girl {

    @Autowired
    Outfit outfit;

    @Autowired
    Accessory accessory;

    public Girl() {
    }

    public Girl(Outfit outfit){
        this.outfit = outfit;
    }

    public Girl(Outfit outfit, Accessory accessory) {
        this.outfit = outfit;
        this.accessory = accessory;
    }

    public Accessory getAccessory() {
        return accessory;
    }

    public void setAccessory(Accessory accessory) {
        this.accessory = accessory;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
