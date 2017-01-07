package com.tornado.ecommerce.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.User;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface UserRepository extends GenericRepository<User,Long> {

	@Query("SELECT u FROM User u WHERE u.loginName = ?1")
	User findByUsername(@Param("username") String username);

}
