package org.demo.writeme_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        // 1) CSRF 비활성화
        .csrf(csrf -> csrf.disable())

        // 2) 요청 경로별 접근 설정
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/users/**").permitAll()
            .requestMatchers("/posts/**").permitAll()
            .anyRequest().authenticated()
        )
        .formLogin(withDefaults());
        // 3) 폼 로그인 비활성화
//        .formLogin(form -> form.disable());

    return http.build();

    // 로그인, 로그아웃, 기타 등등
    // .formLogin(login -> login.loginPage("/login").permitAll())
    // .logout(logout -> logout.permitAll())

  }
}
