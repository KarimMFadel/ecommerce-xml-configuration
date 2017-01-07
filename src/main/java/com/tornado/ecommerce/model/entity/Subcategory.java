package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_subcategory")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_subcategory_recid_seq")
public class Subcategory extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "category_id")
	Category category;
	
	@Column(name = "subcategory_name")
    private String subcategoryName;
	@Column(name = "description")
    private String description;
	@Column(name = "image")
    private String image;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getSubcategoryName() {
		return subcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
