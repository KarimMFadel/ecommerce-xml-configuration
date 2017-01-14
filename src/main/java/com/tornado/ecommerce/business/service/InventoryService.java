package com.tornado.ecommerce.business.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.tornado.ecommerce.model.entity.Inventory;


public interface InventoryService {

	public Inventory save(Inventory inventory);
    public Inventory delete(Long id);
    public List<Inventory> findAll();
    public List<Inventory> findAll(Sort sort);
    public List<Inventory> findAll(Iterable<Long> ids);
    public Inventory update(Inventory inventory);
    public Inventory findOne(Long id);
    public Long getCountOfRow();
}
