package com.spring.steriotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/steriotype/Config.xml");
		
		Person person=context.getBean("person",Person.class);
		
//		System.out.println(person);
		
		System.out.println(person.hashCode());
		
		Person person1=context.getBean("person",Person.class);
		System.out.println(person1.hashCode());
	
	}
}
