package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.OrderDetails;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface OrderDetailsRepository extends GenericRepository<OrderDetails,Long> {

}
