package com.tornado.ecommerce.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tornado.ecommerce.model.entity.base.BaseEntity;

@Entity
@Table(name = "ecommerce_user")
@SequenceGenerator(name="sequance_name",sequenceName="ecommerce_user_recid_seq")
public class User extends BaseEntity{

	@ManyToOne
	@Column(name = "country_id")
	Country country;
	
	@Column(name = "salutation")
    private String salutation;
	@Column(name = "first_name")
    private String firstName;
	@Column(name = "middle_name")
    private String middleName;
	@Column(name = "last_name")
    private String lastName;
	@Column(name = "login_name")
    private String loginName;
	@Column(name = "password")
    private String password;
	@Column(name = "gender")
    private String gender;
	@Column(name = "nationality")
    private String nationality;
	@Column(name = "address")
    private String address;
	@Column(name = "first_phone")
    private String firstPhone;
	@Column(name = "second_phone")
    private String secondPhone;
	@Column(name = "first_email")
    private String firstEmail;
	@Column(name = "second_email")
    private String secondEmail;
	@Column(name = "postal_code")
    private String postalCode;
	@Column(name = "notes")
    private String notes;
	@Column(name = "image")
    private String image;
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
	
    public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFirstPhone() {
		return firstPhone;
	}
	public void setFirstPhone(String firstPhone) {
		this.firstPhone = firstPhone;
	}
	public String getSecondPhone() {
		return secondPhone;
	}
	public void setSecondPhone(String secondPhone) {
		this.secondPhone = secondPhone;
	}
	public String getFirstEmail() {
		return firstEmail;
	}
	public void setFirstEmail(String firstEmail) {
		this.firstEmail = firstEmail;
	}
	public String getSecondEmail() {
		return secondEmail;
	}
	public void setSecondEmail(String secondEmail) {
		this.secondEmail = secondEmail;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
