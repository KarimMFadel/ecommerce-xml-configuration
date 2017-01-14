package com.tornado.ecommerce.model.repository;

import org.springframework.stereotype.Repository;

import com.tornado.ecommerce.model.entity.Inventory;
import com.tornado.ecommerce.model.repository.generic.GenericRepository;

@Repository
public interface InventoryRepository extends GenericRepository<Inventory,Long> {

}
