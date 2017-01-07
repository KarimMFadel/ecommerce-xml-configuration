package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.Country;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface CountryRepository extends GenericRepository<Country,Long> {

}
