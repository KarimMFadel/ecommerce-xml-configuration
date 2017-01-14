package com.tornado.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tornado.ecommerce.business.service.OrderDetailsService;

@RestController
@RequestMapping("/tornado/client/orderDetails")
public class OrderDetailsController {
	
	@Autowired
	OrderDetailsService orderDetailsService;


}
