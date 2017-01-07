package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.Subcategory;


public interface SubcategoryService {

	public Subcategory save(Subcategory Subcategory);
    public Subcategory delete(Long id);
    public List<Subcategory> findAll();
    public List<Subcategory> findAll(Sort sort);
    public List<Subcategory> findAll(Iterable<Long> ids);
    public Subcategory update(Subcategory Subcategory);
    public Subcategory findOne(Long id);
    public Long getCountOfRow();
}
