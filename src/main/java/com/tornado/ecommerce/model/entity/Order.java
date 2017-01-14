package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_order")
@SequenceGenerator(name = "sequance_name", sequenceName = "ecommerce_order_recid_seq")
public class Order extends BaseEntity {
	@ManyToOne
	@JoinColumn(name = "user_id")
	User user;

	@Column(name = "total_price")
	private Long totalPrice;

	@Column(name = "status")
	private String status;

	@Column(name = "num_of_product")
	private Long numOfProduct;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getNumOfProduct() {
		return numOfProduct;
	}

	public void setNumOfProduct(Long numOfProduct) {
		this.numOfProduct = numOfProduct;
	}

}
