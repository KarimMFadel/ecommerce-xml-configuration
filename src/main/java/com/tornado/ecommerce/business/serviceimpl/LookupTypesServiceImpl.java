package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.LookupTypesService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.LookupTypes;
import com.tornado.ecommerce.model.repository.LookupTypesRepository;

@Service
@Transactional
public class LookupTypesServiceImpl extends GenericService<LookupTypes, Long> implements LookupTypesService{

	LookupTypesRepository lookupTypesRepository;
	
	@Autowired
	public LookupTypesServiceImpl(LookupTypesRepository lookupTypesRepository) {
		super(lookupTypesRepository);
		this.lookupTypesRepository = lookupTypesRepository;
	}

}
