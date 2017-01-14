package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.LookupTypes;


public interface LookupTypesService {

	public LookupTypes save(LookupTypes lookupTypes);
    public LookupTypes delete(Long id);
    public List<LookupTypes> findAll();
    public List<LookupTypes> findAll(Sort sort);
    public List<LookupTypes> findAll(Iterable<Long> ids);
    public LookupTypes update(LookupTypes lookupTypes);
    public LookupTypes findOne(Long id);
    public Long getCountOfRow();
}
