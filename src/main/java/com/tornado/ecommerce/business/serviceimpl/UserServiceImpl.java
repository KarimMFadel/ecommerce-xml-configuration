package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.UserService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.common.exception.EcommerceException;
import com.tornado.ecommerce.common.utils.Encryptor;
import com.tornado.ecommerce.model.entity.User;
import com.tornado.ecommerce.model.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl extends GenericService<User, Long> implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super(userRepository);
		this.userRepository = userRepository;
	}

	@Override
	public String login(String username, String password) {
		if(username==null || password==null)
			throw new EcommerceException("error in username and password");
		User user = userRepository.findByUsername(username);
		if (user == null)
			throw new EcommerceException("username not exist");
		if (!user.getPassword().equals(password)) {
			throw new EcommerceException("password not match");
		}
		return Encryptor.getInstance().encrypt(user);
	}

}
