package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.OrderDetailsService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.OrderDetails;
import com.tornado.ecommerce.model.repository.OrderDetailsRepository;

@Service
@Transactional
public class OrderDetailsServiceImpl extends GenericService<OrderDetails, Long> implements OrderDetailsService{

	OrderDetailsRepository orderDetailsRepository;
	
	@Autowired
	public OrderDetailsServiceImpl(OrderDetailsRepository orderDetailsRepository) {
		super(orderDetailsRepository);
		this.orderDetailsRepository = orderDetailsRepository;
	}

}
