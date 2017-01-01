package com.tornado.ecommerce.business.service.generic;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.common.exception.EcommerceException;
import com.tornado.ecommerce.model.entity.base.BaseEntity;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

public abstract class GenericService<T extends BaseEntity, ID extends Serializable> {
	
	
	private GenericRepository<T,ID> genericRepository;
	
	public GenericService(GenericRepository<T,ID> genericRepository) {
		this.genericRepository = genericRepository;
	}

	public List<T> findAll() {
		return genericRepository.findAll();
	}

	public List<T> findAll(Sort sort) {
		if(sort==null)
			throw new EcommerceException("");
		return genericRepository.findAll(sort);
	}

	public List<T> findAll(Iterable<ID> ids){
		if(ids==null)
			throw new EcommerceException();
		return genericRepository.findAll(ids);
	}


	public T getOne(ID id) {
		if(id==null)
			throw new EcommerceException();
		return genericRepository.findOne(id);
	}

	public T delete(ID id){
		if(id==null)
			throw new EcommerceException();
		T deleteEntity = (T) genericRepository.findOne(id);
		if(deleteEntity==null)
			throw new EcommerceException();
		genericRepository.delete(deleteEntity);
		return deleteEntity;
	}
	
	public Long getCountOfRow() {
		return genericRepository.count();
	}
}
