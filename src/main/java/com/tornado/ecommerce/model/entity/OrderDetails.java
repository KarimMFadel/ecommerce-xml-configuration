package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_order_details")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_order_details_recid_seq")
public class OrderDetails extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	Product product;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	Order order;

	@Column(name = "quantity")
	private Long quantity;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	


  
}
