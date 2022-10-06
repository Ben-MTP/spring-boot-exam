package com.core.security.jwt;

import com.core.security.user.CustomUserDetails;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ManhKM on 10/6/2022
 * @project spring-security-hibernate-jwt
 */
@Component
@Slf4j
public class JwtTokenProvider {

  // Đoạn JWT_SECRET này là bí mật, chỉ có phía Server được biết
  private final String JWT_SECRET = "124f093edb90d9bd3c3bdf846a9069d653khongminhmanh593d9d8bb39278fa48893745jlkjguoiwrh45cd398d9f351055c22a95448b8d13706ce7";

  // Thời gian có hiệu lực của chuỗi JWT: 7 ngày
  private final long JWT_EXPIRATION = 7*24*60*60*1000L;

  // Tạo ra jwt từ thông tin user:
  public String generateToken(CustomUserDetails userDetails){
    Date now = new Date();
    Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);

    // Tạo chuỗi json web token từ id của User.
    return Jwts.builder()
        .setSubject(Long.toString(userDetails.getUser().getId()))
        .setIssuedAt(now)
        .setExpiration(expiryDate)
        .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
        .compact();
  }

  // Lấy thông tin user từ jwt:
  public Long getUserIdFromJWT(String token){
    Claims claims = Jwts.parser()
        .setSigningKey(JWT_SECRET)
        .parseClaimsJws(token)
        .getBody();
    return Long.parseLong(claims.getSubject());
  }

  public boolean validateToken(String authToken){
    try {
      Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(authToken);
      return true;
    } catch (MalformedJwtException ex){
      log.error("Invalid JWT Token");
    } catch (ExpiredJwtException ex) {
      log.error("Expired JWT token");
    } catch (UnsupportedJwtException ex) {
      log.error("Unsupported JWT token");
    } catch (IllegalArgumentException ex) {
      log.error("JWT claims string is empty.");
    }
    return false;
  }
}
