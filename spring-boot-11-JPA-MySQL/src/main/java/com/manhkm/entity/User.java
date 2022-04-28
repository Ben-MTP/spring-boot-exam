package com.manhkm.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ManhKM on 8/9/2021
 * @project spring-boot-exam
 * -----
 * Tạo thông tin Model User
 * Khi đã có dữ liệu (cấu trúc bảng + dữ liệu) trong Database. Chúng ta sẽ tạo một Class trong Java để mapping thông tin.
 * Annotation trong Hibernate (@Entity, @Table, @Data-lombok)
 */

@Entity
@Table
@Data
public class User {
    private static final long serialVersionUID = -297553281792804396L;

    /**
     * @Id -> đánh đấu đây sẽ là thuộc tính khóa chính trong Bảng.
     * @GeneratedValue -> đánh đấu thuộc tính này sẽ được tự động tăng.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Mapping thông tin biến với tên cột trong Database.
     * Nếu không đánh dấu @Column thì sẽ mapping tự động theo tên biến.
     */
    @Column(name = "hp")
    private int hp;

    @Column(name = "stamina")
    private int stamina;
    private int atk;
    private int def;
    private int agi;

    // Constructor
    public User(){}
    public User(int hp, int stamina, int atk, int def, int agi){
        this.hp = hp;
        this.stamina = stamina;
        this.atk = atk;
        this.def = def;
        this.agi = agi;
    }
}
