package com.spring.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class Person {

	@Value("suman")
	private String name;
	
	@Value("kolkata")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;
	
	
	
	public Person(String name, String city, List<String> address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public List<String> getAddress() {
		return address;
	}


	public void setAddress(List<String> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", address=" + address + "]";
	}


	
	
}
