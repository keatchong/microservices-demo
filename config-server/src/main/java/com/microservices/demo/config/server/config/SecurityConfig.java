package com.microservices.demo.config.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		// http.csrf().disable()
		// .authorizeHttpRequests()
		// .requestMatchers("/encrypt", "/decrypt","twitter-to-kafka-service/dev")

		// .permitAll()
		// .and()
		// .authorizeHttpRequests().anyRequest().authenticated()).and().httpBasic();

		// .build();

		http.csrf().disable().authorizeHttpRequests(requests -> requests
				.requestMatchers(new AntPathRequestMatcher("/encrypt"), new AntPathRequestMatcher("/decrypt"))
				.permitAll().anyRequest().authenticated()).httpBasic();
		return http.build();

	}

}
