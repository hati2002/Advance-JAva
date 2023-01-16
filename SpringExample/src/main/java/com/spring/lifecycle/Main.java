package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/Config.xml");
		
		//to call the destroy method
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/Config.xml");
		
		Person person=(Person) context.getBean("person");
		
		System.out.println(person);
		
		context.registerShutdownHook();
	}
}
