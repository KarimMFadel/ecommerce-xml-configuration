package com.tornado.ecommerce.business.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tornado.ecommerce.business.service.InventoryService;
import com.tornado.ecommerce.business.service.generic.GenericService;
import com.tornado.ecommerce.model.entity.Inventory;
import com.tornado.ecommerce.model.repository.InventoryRepository;

@Service
@Transactional
public class InventoryServiceImpl extends GenericService<Inventory, Long> implements InventoryService{

	InventoryRepository inventoryRepository;
	
	@Autowired
	public InventoryServiceImpl(InventoryRepository inventoryRepository) {
		super(inventoryRepository);
		this.inventoryRepository = inventoryRepository;
	}

}
