package com.tornado.ecommerce.spring.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import com.tornado.ecommerce.spring.security.CustomAuthenticationProvider;
import com.tornado.ecommerce.spring.security.RestAuthenticationEntryPoint;
import com.tornado.ecommerce.spring.security.RestAuthenticationSuccessHandler;
import com.tornado.ecommerce.spring.security.RestUsernamePasswordAuthenticationFilter;

/**
 * @URL http://websystique.com/spring-security/angularjs-basic-authentication-using-spring-security/
 * @author Karim M.Fadel
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
				.antMatchers("/css/**", "/js/**", "/img/**").permitAll()
				.antMatchers("/tornado/admin/**").hasRole("ADMIN") // remove 'Role_' from 'Role_admin' because ERROR : role should not start with 'ROLE_' since it is automatically inserted. Got 'ROLE_ADMIN'
				.antMatchers("/tornado/admin/**").hasAnyRole(new String[] {"USER","STORE"})				
				.and().httpBasic().authenticationEntryPoint(getBasicAuthEntryPoint())
				.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)//We don't need session.
				.and().addFilter(customUsernamePasswordAuthenticationFilter());
	}
	
	@Bean
	public CustomAuthenticationProvider customAuthenticationProvider() {
		CustomAuthenticationProvider customAuthenticationProvider = new CustomAuthenticationProvider();
		return customAuthenticationProvider;
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		List<AuthenticationProvider> authenticationProviderList = new ArrayList<AuthenticationProvider>();
		authenticationProviderList.add(customAuthenticationProvider());
		AuthenticationManager authenticationManager = new ProviderManager(
				authenticationProviderList);
		return authenticationManager;
	}
	
	@Bean
	public RestUsernamePasswordAuthenticationFilter customUsernamePasswordAuthenticationFilter() throws Exception {
		RestUsernamePasswordAuthenticationFilter restUsernamePasswordAuthenticationFilter = new RestUsernamePasswordAuthenticationFilter();
		restUsernamePasswordAuthenticationFilter.setPostOnly(false);
		restUsernamePasswordAuthenticationFilter.setAuthenticationManager(authenticationManagerBean());
		restUsernamePasswordAuthenticationFilter.setAuthenticationSuccessHandler(getAuthenticationSuccessHandler());
		return restUsernamePasswordAuthenticationFilter;
	}
	
	@Bean
    public RestAuthenticationEntryPoint getBasicAuthEntryPoint(){
        return new RestAuthenticationEntryPoint();
    }
	
	@Bean
    public RestAuthenticationSuccessHandler getAuthenticationSuccessHandler(){
        return new RestAuthenticationSuccessHandler();
    }
	
	/** important 
	 * To allow Pre-flight [OPTIONS] request from browser 
	 * 
	 * */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**")
        	.antMatchers(HttpMethod.GET,"/index.jsp")
        	.antMatchers("/tornado/login/**")
			.antMatchers("/tornado/client/**");
    }

}
