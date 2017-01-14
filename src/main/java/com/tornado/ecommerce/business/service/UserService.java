package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.User;


public interface UserService {

	public User save(User User);
    public User delete(Long id);
    public List<User> findAll();
    public List<User> findAll(Sort sort);
    public List<User> findAll(Iterable<Long> ids);
    public User update(User User);
    public User findOne(Long id);
    public Long getCountOfRow();
    /*  add method  */
	public String login(String username, String password);
	public User findByUsernameAndPassword(String username, String password);
    
}
