package com.tornado.ecommerce.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_inventory")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_inventory_recid_seq")
public class Inventory extends BaseEntity{
	@ManyToOne
	@JoinColumn(name = "ecommerce_product")
	Product product;
	@ManyToOne
	@JoinColumn(name = "ecommerce_user")
	User user;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

  
}
