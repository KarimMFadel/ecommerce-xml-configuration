package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_lookup")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_lookup_recid_seq")
public class Lookup extends BaseEntity{
	@ManyToOne
	@JoinColumn(name = "lookup_types_id")
	LookupTypes lookupTypes;
	
	@Column(name = "lookup_name")
    private String lookupName;
	
	@Column(name = "type_name")
    private String typeName;

	public LookupTypes getLookupTypes() {
		return lookupTypes;
	}

	public void setLookupTypes(LookupTypes lookupTypes) {
		this.lookupTypes = lookupTypes;
	}

	public String getLookupName() {
		return lookupName;
	}

	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
