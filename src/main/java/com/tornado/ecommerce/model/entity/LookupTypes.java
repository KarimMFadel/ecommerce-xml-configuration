package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_lookup_types")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_lookup_types_recid_seq")
public class LookupTypes extends BaseEntity{

	@Column(name = "type_name")
	private Long typeName;

	public Long getTypeName() {
		return typeName;
	}

	public void setTypeName(Long typeName) {
		this.typeName = typeName;
	}
	
	

}
