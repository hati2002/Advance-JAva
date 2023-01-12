package com.hql.HqlProject;

import java.util.Iterator;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;
import org.hibernate.*;
import org.hibernate.query.*;


public class HqlExample {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("Hql.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
//		
//		Student stu1=new Student();
//		stu1.setId(101);
//		stu1.setName("suman");
//		stu1.setCity("kolkata");
//		
//		Student stu2=new Student();
//		stu2.setId(102);
//		stu2.setName("pratik");
//		stu2.setCity("jharkhand");
//		
//		Transaction transaction=session.beginTransaction();
//		session.save(stu1);
//		session.save(stu2);
//		
//		transaction.commit();
		
		//query for select all student
		String query="from Student where city='kolkata'";
		
		//to get query object
		org.hibernate.query.Query  q = session.createQuery(query);
		
		List<Student> list=q.list();
		
		for (Student s:list) {
			
			System.out.println(s.getName());
		}
		
		
		//query for delete
//		Transaction transaction=session.beginTransaction();
//		org.hibernate.Query q1=session.createQuery("delete from Student where city='jharkhand'");
//		int i=q1.executeUpdate();
//		System.out.println("deleted.........");
//		System.out.println(i);
//		
//		transaction.commit();
		
		//query for update
		Transaction tx=session.beginTransaction();
		org.hibernate.Query q2=session.createQuery("update Student set city='odisha' where city='kolkata'");
		int r=q2.executeUpdate();
		System.out.println("updated.......");
		System.out.println(r);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
