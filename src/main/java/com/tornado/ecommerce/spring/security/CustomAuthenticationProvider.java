package com.tornado.ecommerce.spring.security;

import java.util.Collection;
import java.util.HashSet;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.tornado.ecommerce.business.service.UserService;
import com.tornado.ecommerce.model.entity.Role;
import com.tornado.ecommerce.model.entity.User;

public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private UserService userService;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
		String username = String.valueOf(auth.getPrincipal());
		String password = String.valueOf(auth.getCredentials());

		// 1. Use the username to load the data for the user, including
		// authorities and password.
		// 2. Check the passwords match.
		User user = userService.findByUsernameAndPassword(username, password);

		// 3. Preferably clear the password in the user object before storing in
		// authentication object
		user.setPassword("");

		// 4. Return an authenticated token, containing user data and
		// authorities
		Collection<GrantedAuthority> authorities = new HashSet<GrantedAuthority>(5);
		for (Role role : user.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		// authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

		// return UsernamePasswordAuthenticationToken(user,
		// null,user.getAuthorities()) ;
		return new UsernamePasswordAuthenticationToken(user, null, authorities);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// To indicate that this authenticationprovider can handle the auth request. 
		// since there's currently only one way of logging in, always
		// return true
		// return false;
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
