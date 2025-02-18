package org.demo.writeme_demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        // csrf 설정
        .csrf(csrf -> csrf.disable())

        // 요청 경로별 인증 정책
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/users/**").permitAll()
            .anyRequest().authenticated()
        )

    // 로그인, 로그아웃, 기타 등등
    // .formLogin(login -> login.loginPage("/login").permitAll())
    // .logout(logout -> logout.permitAll())

    ;

    return http.build();
  }
}
