package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.Category;


public interface CategoryService {

	public Category save(Category Category);
    public Category delete(Long id);
    public List<Category> findAll();
    public List<Category> findAll(Sort sort);
    public List<Category> findAll(Iterable<Long> ids);
    public Category update(Category Category);
    public Category findOne(Long id);
    public Long getCountOfRow();
}
