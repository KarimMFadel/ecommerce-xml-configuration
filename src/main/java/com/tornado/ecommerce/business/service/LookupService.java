package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.Lookup;


public interface LookupService {

	public Lookup save(Lookup lookup);
    public Lookup delete(Long id);
    public List<Lookup> findAll();
    public List<Lookup> findAll(Sort sort);
    public List<Lookup> findAll(Iterable<Long> ids);
    public Lookup update(Lookup lookup);
    public Lookup findOne(Long id);
    public Long getCountOfRow();
}
