package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SpringConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		//http.authorizeHttpRequests(request->request.requestMatchers("/").permitAll().anyRequest().authenticated());
		http.csrf()
        .disable()
        .authorizeRequests()
        .requestMatchers("/admin/**")
        .hasRole("ADMIN")
        .requestMatchers("/user/**")
        .hasRole("USER").
        requestMatchers("/","/login","/WEB-INF/jsps/**")
        .permitAll()
        .anyRequest()
        .authenticated()
        .and()
        .formLogin()
        .loginPage("/login");
		
		
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user1 = User.withUsername("saii")
            .password(passwordEncoder().encode("123"))
            .roles("USER")
            .build();
        UserDetails user2 = User.withUsername("sahil")
            .password(passwordEncoder().encode("123"))
            .roles("ADMIN")
            .build();
       
        return new InMemoryUserDetailsManager(user1, user2);
    }
	
	
	@Bean 
	public PasswordEncoder passwordEncoder() { 
	    return new BCryptPasswordEncoder(); 
	}
}

