package com.odm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder pwdEncoder = new BCryptPasswordEncoder();

		auth.inMemoryAuthentication()
				.withUser("1").password(pwdEncoder.encode("1")).roles("USER") //roles() 需要完整的角色名稱  , authorities（）需要完整的角色名稱
			.and()
				.withUser("2").password(pwdEncoder.encode("2")).roles("USER")
			.and()
				.withUser("admin").password(pwdEncoder.encode("admin")).roles("ADMIN");
	}

	 @Override
	    protected void configure(final HttpSecurity http) throws Exception {
			http.authorizeRequests()
			.antMatchers("/homePage").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
			.antMatchers("/userPage").access("hasRole('ROLE_USER')")
			.antMatchers("/adminPage").access("hasRole('ROLE_ADMIN')")
			.and()
				.formLogin().loginPage("/loginPage")
				.defaultSuccessUrl("/homePage")
				.failureUrl("/loginPage?error")
				.usernameParameter("username").passwordParameter("password")				
			.and()
				.logout().logoutSuccessUrl("/loginPage?logout"); 
		
	    }
	     

	// 配置Spring Security的Filter链
	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}

}
