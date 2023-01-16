package com.spring.lifecycle.interfac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/interfac/Config.xml");
		
		//to call the destroy method
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/interfac/Config.xml");
		
		Student student=(Student) context.getBean("student");
		
		System.out.println(student);
		
		context.registerShutdownHook();
	}
}
