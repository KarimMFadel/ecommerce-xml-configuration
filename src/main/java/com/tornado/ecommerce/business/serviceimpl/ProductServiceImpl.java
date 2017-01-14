package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.ProductService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.Product;
import com.tornado.ecommerce.model.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl extends GenericService<Product, Long> implements ProductService{

	ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		super(productRepository);
		this.productRepository = productRepository;
	}

}
