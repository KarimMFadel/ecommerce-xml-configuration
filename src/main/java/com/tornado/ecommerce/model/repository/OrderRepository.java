package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.Order;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface OrderRepository extends GenericRepository<Order,Long> {

}
