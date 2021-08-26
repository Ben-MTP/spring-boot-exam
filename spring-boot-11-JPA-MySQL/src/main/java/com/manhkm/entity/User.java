package com.manhkm.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 */

@Entity
@Table
@Data
public class User {
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
}
