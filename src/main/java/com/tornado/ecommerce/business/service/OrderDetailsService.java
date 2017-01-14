package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.OrderDetails;


public interface OrderDetailsService {

	public OrderDetails save(OrderDetails orderDetails);
    public OrderDetails delete(Long id);
    public List<OrderDetails> findAll();
    public List<OrderDetails> findAll(Sort sort);
    public List<OrderDetails> findAll(Iterable<Long> ids);
    public OrderDetails update(OrderDetails orderDetails);
    public OrderDetails findOne(Long id);
    public Long getCountOfRow();
}
