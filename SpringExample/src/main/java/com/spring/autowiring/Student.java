package com.spring.autowiring;

public class Student {

	private int id;
	private String name;
	private Address address;
	private Certificate certi;
	
	

	public Student(int id, String name, Address address, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.certi = certi;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", certi=" + certi + "]";
	}

	
	
	
}
