package com.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http.csrf().disable().authorizeRequests()
              .anyRequest().authenticated()
              .and()
              .formLogin()
              .and()
              .httpBasic();;
        return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails zahid = User.builder().username("zahid")
                .password("{noop}zahid123").roles("STUDENT").build();

        UserDetails hasan = User.builder().username("hasan")
                .password("{noop}hasan123").roles("TEACHER").build();


        UserDetails sahin = User.builder().username("sahin")
                .password("{noop}sahin123").roles("TEACHER","ADMIN").build();

        return new InMemoryUserDetailsManager(zahid,hasan,sahin);

    }
}