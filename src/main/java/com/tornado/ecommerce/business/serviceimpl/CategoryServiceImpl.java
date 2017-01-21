package com.tornado.ecommerce.business.serviceimpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.CategoryService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.Category;
import com.tornado.ecommerce.model.repository.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImpl extends GenericService<Category, Long> implements CategoryService {

	final static Logger logger = Logger.getLogger(CategoryServiceImpl.class);
	
	private CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		super(categoryRepository);
		this.categoryRepository = categoryRepository;
	}

	

}
