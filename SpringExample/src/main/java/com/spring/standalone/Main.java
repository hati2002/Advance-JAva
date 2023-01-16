package com.spring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/standalone/Config.xml");
		
		Employee employee=(Employee) context.getBean("emp");
		
		System.out.println(employee);
		System.out.println(employee.getPhone().getClass().getName());
	}
}
