package com.spring.lifecycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/annotation/Config.xml");
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/lifecycle/annotation/Config.xml");
		
		Employee employee=(Employee) context.getBean("emp");
		
		System.out.println(employee);
		
		context.registerShutdownHook();
	}
}
