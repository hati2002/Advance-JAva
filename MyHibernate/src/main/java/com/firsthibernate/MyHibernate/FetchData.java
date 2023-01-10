package com.firsthibernate.MyHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		//get(),load()
		   SessionFactory factory=new Configuration().configure().buildSessionFactory();
		   
		   Session session=factory.openSession();
		   //get-student id
		 Student student=(Student)session.get(Student.class, 1);
		 System.out.println(student);
		 
		   session.close();
		   factory.close();
	}
}
