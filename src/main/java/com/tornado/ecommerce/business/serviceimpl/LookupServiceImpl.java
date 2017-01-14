package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.LookupService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.Lookup;
import com.tornado.ecommerce.model.repository.LookupRepository;

@Service
@Transactional
public class LookupServiceImpl extends GenericService<Lookup, Long> implements LookupService{

	LookupRepository lookupRepository;
	
	@Autowired
	public LookupServiceImpl(LookupRepository lookupRepository) {
		super(lookupRepository);
		this.lookupRepository = lookupRepository;
	}

}
