package com.core.security.payload;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author ManhKM on 10/6/2022
 * @project spring-security-hibernate-jwt
 */
@Data
public class LoginRequest {

  @NotBlank
  private String username;

  @NotBlank
  private String password;
}
