package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.Category;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface CategoryRepository extends GenericRepository<Category,Long> {

}
