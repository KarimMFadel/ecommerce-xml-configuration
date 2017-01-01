package com.tornado.ecommerce.model.entity.base;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

@MappedSuperclass
public  class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="sequance_name")
	@Column(name = "recid") 
	private Long id;

	@Embedded
	Audit audit = new Audit();	
	
	@Column(name = "is_retired")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean isRetired;
	
    @Column(name = "retired_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date retiredAt;
    
    @Column(name = "retired_by")
    private String retiredBy;
	
	@Version
	private Long version;
	
	public BaseEntity() {
		super();
	}

	public BaseEntity(Long id) {
		super();
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BaseEntity [getId()=" + getId() + "]";			
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isRetired() {
		return isRetired;
	}

	public void setRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}

	public Date getRetiredAt() {
		return retiredAt;
	}

	public void setRetiredAt(Date retiredAt) {
		if(isRetired)
			this.retiredAt = new Date();
		this.retiredAt = retiredAt;
	}

	public String getRetiredBy() {
		return retiredBy;
	}

	public void setRetiredBy(String retiredBy) {
		this.retiredBy = retiredBy;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}
	
}
