package com.tornado.ecommerce.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_country")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_country_recid_seq")
public class Country extends BaseEntity{

    @Column(name = "country_name")
    private String countryName;

}
