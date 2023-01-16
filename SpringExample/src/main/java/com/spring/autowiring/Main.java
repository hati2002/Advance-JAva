package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowiring/Config.xml");
		
		Student student=(Student) context.getBean("student1");
		
		System.out.println(student);
	}
}
