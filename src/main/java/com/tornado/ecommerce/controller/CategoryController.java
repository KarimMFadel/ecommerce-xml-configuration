package com.tornado.ecommerce.controller;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tornado.ecommerce.business.service.CategoryService;
import com.tornado.ecommerce.common.dto.EcommerceResponce;
import com.tornado.ecommerce.model.entity.Category;

@RestController
@RequestMapping("/tornado/admin/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json",consumes = "application/json")
	public EcommerceResponce create(@RequestBody Category category){
			return EcommerceResponce.successResponce("success", categoryService.save(category));
	}
	
	@RequestMapping(method = RequestMethod.PUT, produces = "application/json",consumes = "application/json")
    public EcommerceResponce update(@RequestBody Category category){
			return EcommerceResponce.successResponce("success", categoryService.update(category));
    }
	
	@RequestMapping(method = RequestMethod.DELETE, produces = "application/json")
    public EcommerceResponce delete(@QueryParam("id") Long id){
			return EcommerceResponce.successResponce("sucess",categoryService.delete(id) );
    }
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public EcommerceResponce findAll(){	
		List<Category> categories = categoryService.findAll();
		return EcommerceResponce.successResponce("success", categories);
    }
	
	
	@RequestMapping(value = "/findById", method = RequestMethod.GET, produces = "application/json")
    public EcommerceResponce findById(@QueryParam("id") Long id){	
			return EcommerceResponce.successResponce("success",categoryService.findOne(id));
	}

}
