package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.Product;


public interface ProductService {

	public Product save(Product product);
    public Product delete(Long id);
    public List<Product> findAll();
    public List<Product> findAll(Sort sort);
    public List<Product> findAll(Iterable<Long> ids);
    public Product update(Product product);
    public Product findOne(Long id);
    public Long getCountOfRow();
}
