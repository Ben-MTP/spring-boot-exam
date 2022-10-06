package com.core.security.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author ManhKM on 10/6/2022
 * @project spring-security-hibernate-jwt
 */
@Entity
@Table(name = "users")
@Data
public class User {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

  public void setId(Long id) {
    this.id = id;
  }

  @Id
  public Long getId() {
    return id;
  }
}
