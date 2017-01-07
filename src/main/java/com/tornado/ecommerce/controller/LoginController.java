package com.tornado.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tornado.ecommerce.business.service.UserService;
import com.tornado.ecommerce.common.dto.UsernamePasswordDTO;

@RestController
@RequestMapping("/tornado/login")
public class LoginController {

	@Autowired
	private UserService UserService;

	@RequestMapping(method = RequestMethod.POST, produces = "application/json",consumes = "application/json")
	public ResponseEntity<String> login(@RequestBody UsernamePasswordDTO usernamePasswordDTO){
		String token = UserService.login(usernamePasswordDTO.getUsername(),usernamePasswordDTO.getPassword());
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("Token", token);
		return new ResponseEntity<String>("", responseHeaders, HttpStatus.OK);
	}
}
