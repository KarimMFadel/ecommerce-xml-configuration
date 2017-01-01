package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;
import com.tornado.ecommerce.model.entity.User;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface CountryRepository extends GenericRepository<User,Long> {

}
