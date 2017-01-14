package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.Lookup;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface LookupRepository extends GenericRepository<Lookup,Long> {

}
