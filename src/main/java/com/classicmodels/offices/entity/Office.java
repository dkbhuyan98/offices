package com.classicmodels.offices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "offices")
public class Office {
	@Id
	@Column(name = "officeCode")
	private String officeCode;
	@Column(name = "city")
	private String city;
	@Column(name = "phone")
	private String phone;
	@Column(name = "addressLine1")
	private String address1;
	@Column(name = "addressLine2")
	private String address2;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	@Column(name = "postalCode")
	private String postalCode;
	@Column(name = "territory")
	private String territory;
	
	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Office(String officeCode, String city, String phone, String address1, String address2, String state,
			String country, String postalCode, String territory) {
		super();
		this.officeCode = officeCode;
		this.city = city;
		this.phone = phone;
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
	}

	@Override
	public String toString() {
		return "Office [officeCode=" + officeCode + ", city=" + city + ", phone=" + phone + ", address1=" + address1
				+ ", address2=" + address2 + ", state=" + state + ", country=" + country + ", postalCode=" + postalCode
				+ ", territory=" + territory + "]";
	}
	
}
