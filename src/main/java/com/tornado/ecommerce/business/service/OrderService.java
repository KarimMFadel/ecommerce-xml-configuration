package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.Order;


public interface OrderService {

	public Order save(Order order);
    public Order delete(Long id);
    public List<Order> findAll();
    public List<Order> findAll(Sort sort);
    public List<Order> findAll(Iterable<Long> ids);
    public Order update(Order order);
    public Order findOne(Long id);
    public Long getCountOfRow();
}
