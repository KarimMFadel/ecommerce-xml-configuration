package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.Product;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface ProductRepository extends GenericRepository<Product,Long> {

}
