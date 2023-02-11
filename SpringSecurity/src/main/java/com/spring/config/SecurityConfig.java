package com.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//create spring security filter chain
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// create some details for user

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth
		.inMemoryAuthentication()
		.withUser("suman")
		.password("suman123")
		.roles("admin")
		.and()
		.withUser("hati").password("2020").roles("user");
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {

		return NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
	http
	.authorizeRequests()
	.antMatchers("/helloworld").authenticated()    //after login page will visible
	.antMatchers("/hello").authenticated()  
	.antMatchers("/hii").permitAll()  //with out login page will visible
	.and()
	.formLogin().loginPage("/myCustomLogin").loginProcessingUrl("/proccess-login")  //in place of default login page user login page will shown
	.and()
	.httpBasic();}
}
