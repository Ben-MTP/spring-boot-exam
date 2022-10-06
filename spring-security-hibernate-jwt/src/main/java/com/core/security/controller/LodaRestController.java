package com.core.security.controller;

import com.core.security.jwt.JwtTokenProvider;
import com.core.security.payload.LoginRequest;
import com.core.security.payload.LoginResponse;
import com.core.security.payload.RandomStuff;
import com.core.security.user.CustomUserDetails;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManhKM on 10/6/2022
 * @project spring-security-hibernate-jwt
 */
@RestController
@RequestMapping("/api")
public class LodaRestController {

  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  private JwtTokenProvider tokenProvider;

  @PostMapping("/login")
  public LoginResponse authenticateUser(@Valid @RequestBody LoginRequest loginRequest){

    // Xác thực từ username và password:
    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            loginRequest.getUsername(),
            loginRequest.getPassword()
        )
    );

    // Nếu không xảy ra exception từ là thông tin hợp lệ
    // Set thông tin authentication vào Security Context
    SecurityContextHolder.getContext().setAuthentication(authentication);

    // Trả về JWT cho người dùng:
    String jwt = tokenProvider.generateToken((CustomUserDetails) authentication.getPrincipal());
    return new LoginResponse(jwt);
  }

  /**
   * API /api/random yêu cầu phải xác thực mới có thể request
   * @return
   */
  @GetMapping("/random")
  public RandomStuff randomStuff(){
    return new RandomStuff("JWT hợp lệ mới có thể thấy được message này");
  }
}
