package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_product")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_product_recid_seq")
public class Product extends BaseEntity{

	@ManyToOne
	@JoinColumn(name = "subcategory_id")
	Subcategory subcategory;
	
	@Column(name = "product_name")
    private String productName;
	
	@Column(name = "short_description")
    private String shortDescription;
	
	@Column(name = "long_description")
    private String longDescription;
	
	@Column(name = "image")
    private String image;
	
	@Column(name = "price")
    private String price;
	
	@Column(name = "manufactory")
    private String manufactory;
	
	@Column(name = "notes")
    private String notes;

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getManufactory() {
		return manufactory;
	}

	public void setManufactory(String manufactory) {
		this.manufactory = manufactory;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
