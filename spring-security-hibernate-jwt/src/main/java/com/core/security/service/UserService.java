package com.core.security.service;

import com.core.security.repository.UserRepository;
import com.core.security.user.CustomUserDetails;
import com.core.security.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ManhKM on 10/6/2022
 * @project spring-security-hibernate-jwt
 */
@Service
public class UserService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    // Kiểm tra xem username có tồn tại trong Database hay không?
    User user = userRepository.findByUsername(username);
    if(user == null){
      throw new UsernameNotFoundException(username);
    }
    return new CustomUserDetails(user);
  }

  // JWTAuthenticationFilter sẽ sử dụng hàm này
  @Transactional
  public UserDetails loadUserById(Long id){
    User user = userRepository.findById(id).orElseThrow(
        () -> new UsernameNotFoundException("User not found with id: " + id)
    );
    return new CustomUserDetails(user);
  }
}
