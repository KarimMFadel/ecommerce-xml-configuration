package com.tornado.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tornado.ecommerce.business.service.LookupTypesService;

@RestController
@RequestMapping("/tornado/admin/lookupTypes")
public class LookupTypesController {
	
	@Autowired
	LookupTypesService lookupTypesService;


}
