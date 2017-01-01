package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.Subcategory;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface SubcategoryRepository extends GenericRepository<Subcategory,Long> {

}
