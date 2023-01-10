package com.firsthibernate.MyHibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private int addressId;
	
	@Column(length = 50,name = "CITY")
	private String cityString;
	
	@Column(length = 50,name = "STREET")
	private String street;
	
	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	public Address(int addressId, String cityString, String street, Date addedDate) {
		super();
		this.addressId = addressId;
		this.cityString = cityString;
		this.street = street;
		this.addedDate = addedDate;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCityString() {
		return cityString;
	}

	public void setCityString(String cityString) {
		this.cityString = cityString;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityString=" + cityString + ", street=" + street + ", addedDate="
				+ addedDate + "]";
	}
	
	
}
