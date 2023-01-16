package com.spring.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	private int id;
	private String name;
	
	@Autowired
	private Address address;
	
	public Person(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.address = addr;
	}

	
	public Person() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address addr) {
		this.address = addr;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
