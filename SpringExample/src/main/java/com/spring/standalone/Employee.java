package com.spring.standalone;

import java.util.List;

public class Employee {

	private String name;
	private List<String> phone;
	
	public Employee(String name, List<String> phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	
	public Employee() {
		super();

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
