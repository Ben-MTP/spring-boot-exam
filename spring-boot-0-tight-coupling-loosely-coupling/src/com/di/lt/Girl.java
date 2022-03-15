package com.di.lt;

import com.di.lt.IGlove;
import com.di.lt.Outfit;

/**
 * @author ManhKM on 3/15/2022
 * @project spring-boot-0-tight-coupling-loosely-coupling
 */
public class Girl {
    private Outfit outfit;
    private IGlove iGlove;

    /**
     * Case1: Constructor Injection
     * Linh động trong phần gắn Dependency với Girl.
     * Gần như đã hoàn toàn tách Outfit(Bikini) ra khỏi Girl.
     */
    public Girl(Outfit outfit){

        // Không bị phục thuộc vào thời điểm khởi tạo.
        this.outfit = outfit;
    }

    public Girl(Outfit outfit, IGlove iGlove){

        // Không bị phục thuộc vào thời điểm khởi tạo.
        this.outfit = outfit;
        this.iGlove = iGlove;
    }

    public IGlove getiGlove() {
        return iGlove;
    }

    public Girl() {

    }

    public Outfit getOutfit() {
        return outfit;
    }

    /**
     * Case 2: Setter Injection.
     * @param outfit
     */
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public String sayHello(){
        return getOutfit().getClass().toString();
    }
}
