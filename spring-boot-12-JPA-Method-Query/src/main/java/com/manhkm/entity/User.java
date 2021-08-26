package com.manhkm.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */
@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hp")
    private int hp;

    @Column(name = "stamina")
    private int stamina;

    private int atk;
    private int def;
    private int agi;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
