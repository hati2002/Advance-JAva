package com.hql.HqlProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlExample {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		
		
		
		factory.close();
	}
}
