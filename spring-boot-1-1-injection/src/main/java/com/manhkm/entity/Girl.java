package com.manhkm.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    public Outfit outfit;
    private Outfit outfit1;

    public Outfit getOutfit() {
        return outfit;
    }
}
