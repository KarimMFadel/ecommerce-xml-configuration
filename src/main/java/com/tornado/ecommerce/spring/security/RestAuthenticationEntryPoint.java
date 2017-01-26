package com.tornado.ecommerce.spring.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.google.gson.Gson;
/**
* Authentication entry point for REST services
*  (entry point is a concept of Spring Security for handling unauthenticated access, 
*  for example by redirecting to login page) 
*/
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint{

	@Override
	public void commence(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException authenticationException)
			throws IOException, ServletException {

	}

}
