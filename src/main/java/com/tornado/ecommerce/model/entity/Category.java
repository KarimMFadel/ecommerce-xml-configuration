package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_category")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_category_recid_seq")
public class Category extends BaseEntity{

    @Column(name = "category_name")
    private String categoryName;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "image")
    private String image;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
