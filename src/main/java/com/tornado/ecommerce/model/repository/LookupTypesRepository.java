package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.LookupTypes;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface LookupTypesRepository extends GenericRepository<LookupTypes,Long> {

}
