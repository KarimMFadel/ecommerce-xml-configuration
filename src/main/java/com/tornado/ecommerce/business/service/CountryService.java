package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.Country;


public interface CountryService {

	public Country save(Country Country);
    public Country delete(Long id);
    public List<Country> findAll();
    public List<Country> findAll(Sort sort);
    public List<Country> findAll(Iterable<Long> ids);
    public Country update(Country Country);
    public Country findOne(Long id);
    public Long getCountOfRow();
}
