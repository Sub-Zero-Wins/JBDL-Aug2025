package com.example.demo.config;

import org.springdoc.core.properties.SwaggerUiConfigProperties.Csrf;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig
{

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.csrf(AbstractHttpConfigurer::disable) 
		.authorizeHttpRequests(auth -> auth
				.requestMatchers("/admin/**").hasRole("ADMIN")   // allow admin and subpaths
				.requestMatchers("/user/**").hasRole("USER")     // allow user and subpaths
				.anyRequest().authenticated()
				)
		.httpBasic(Customizer.withDefaults())
		.formLogin(AbstractHttpConfigurer::disable);

		return http.build();

	}


	@Bean
	public UserDetailsService users()
	{
		UserDetails admin = User.withUsername("Syed").password("{noop}Syed@123").roles("ADMIN").build();
		UserDetails user1 = User.withUsername("Sarfaraz").password("{noop}Sarfaraz@123").roles("USER").build();
		UserDetails user2 = User.withUsername("Anusha").password("{noop}Anusha@123").roles("USER").build();

		return new InMemoryUserDetailsManager(admin,user1,user2);

	}


}
