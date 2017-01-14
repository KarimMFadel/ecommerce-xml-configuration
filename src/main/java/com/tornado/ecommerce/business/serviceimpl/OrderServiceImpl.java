package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.OrderService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.Order;
import com.tornado.ecommerce.model.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl extends GenericService<Order, Long> implements OrderService{

	OrderRepository productRepository;
	
	@Autowired
	public OrderServiceImpl(OrderRepository productRepository) {
		super(productRepository);
		this.productRepository = productRepository;
	}

}
