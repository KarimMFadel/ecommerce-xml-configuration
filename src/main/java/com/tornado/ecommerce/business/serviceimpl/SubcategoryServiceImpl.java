package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.SubcategoryService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.Subcategory;
import com.tornado.ecommerce.model.repository.SubcategoryRepository;

@Service
@Transactional
public class SubcategoryServiceImpl extends GenericService<Subcategory, Long> implements SubcategoryService{

	private SubcategoryRepository subcategoryRepository;
	
	@Autowired
	public SubcategoryServiceImpl(SubcategoryRepository subcategoryRepository) {
		super(subcategoryRepository);
		this.subcategoryRepository = subcategoryRepository ; 
	}

}
