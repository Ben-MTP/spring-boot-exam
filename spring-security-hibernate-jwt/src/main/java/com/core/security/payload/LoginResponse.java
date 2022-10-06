package com.core.security.payload;

import lombok.Data;

/**
 * @author ManhKM on 10/6/2022
 * @project spring-security-hibernate-jwt
 */
@Data
public class LoginResponse {

  private String accessToken;
  private String tokenType = "Bearer";

  public LoginResponse(String accessToken) {
    this.accessToken = accessToken;
  }
}
