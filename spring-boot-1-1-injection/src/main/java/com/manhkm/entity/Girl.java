package com.manhkm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    private Outfit outfit;

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit){
        this.outfit = outfit;
    }
}
