package com.tornado.ecommerce.controller;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tornado.ecommerce.business.service.SubcategoryService;
import com.tornado.ecommerce.common.dto.EcommerceResponce;
import com.tornado.ecommerce.model.entity.Subcategory;

@RestController
@RequestMapping("/tornado/client/subcategory")
public class SubcategoryController { 

	@Autowired
	private SubcategoryService subcategoryService;
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json",consumes = "application/json")
	public EcommerceResponce create(@RequestBody Subcategory subcategory){
			return EcommerceResponce.successResponce("success", subcategoryService.save(subcategory));
	}
	
	@RequestMapping(method = RequestMethod.PUT, produces = "application/json",consumes = "application/json")
    public EcommerceResponce update(@RequestBody Subcategory subcategory){
			return EcommerceResponce.successResponce("success", subcategoryService.update(subcategory));
    }
	
	@RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public EcommerceResponce delete(@QueryParam("id") Long id){
			return EcommerceResponce.successResponce("sucess",subcategoryService.delete(id) );
    }
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public EcommerceResponce findAll(){	
		List<Subcategory> categories = subcategoryService.findAll();
		return EcommerceResponce.successResponce("success", categories);
    }
	
	
	@RequestMapping(value = "/findById", method = RequestMethod.GET, produces = "application/json")
    public EcommerceResponce findById(@QueryParam("id") Long id){	
			return EcommerceResponce.successResponce("success",subcategoryService.findOne(id));
	}

}
