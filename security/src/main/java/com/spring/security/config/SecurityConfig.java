package com.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http.authorizeHttpRequests(configurer ->
              configurer.requestMatchers(HttpMethod.GET,"api/student").hasAnyRole("STUDENT","TEACHER","ADMIN")
                      .requestMatchers(HttpMethod.GET,"api/student/**").hasAnyRole("STUDENT","TEACHER","ADMIN")
                      .requestMatchers(HttpMethod.POST,"api/student").hasAnyRole("TEACHER","ADMIN")
                      .requestMatchers(HttpMethod.PUT,"api/student").hasRole("ADMIN")
                      .requestMatchers(HttpMethod.DELETE,"api/student").hasRole("ADMIN")
                      .requestMatchers(HttpMethod.DELETE,"api/student/**").hasRole("ADMIN")
                      .requestMatchers("swagger-ui/**","api-docs/**").permitAll())
              ;
        http.csrf().disable().httpBasic();;
        return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails zahid = User.builder().username("zahid")
                .password("{noop}zahid123").roles("STUDENT").build();

        UserDetails hasan = User.builder().username("hasan")
                .password("{noop}hasan123").roles("STUDENT","TEACHER").build();


        UserDetails sahin = User.builder().username("sahin")
                .password("{noop}sahin123").roles("STUDENT","TEACHER","ADMIN").build();

        return new InMemoryUserDetailsManager(zahid,hasan,sahin);

    }
}