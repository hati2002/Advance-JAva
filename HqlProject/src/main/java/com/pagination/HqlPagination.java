package com.pagination;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Array;
import org.hibernate.query.NativeQuery;

import com.mysql.cj.Query;

public class HqlPagination {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("Hql.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		
		Student student1=new Student(100, "suman", "kolkata");
		Student student2=new Student(200, "pratik", "jharkhand");
		Student student3=new Student(300, "golu", "jharkhand");
		Student student4=new Student(400, "satya", "odisha");
		Student student5=new Student(500, "rishi", "bihar");
		Student student6=new Student(600, "padma", "kolkata");
		
	
		Transaction tx=session.beginTransaction();
		session.save(student1);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		session.save(student5);
		session.save(student6);
		
		tx.commit();
		
		//write a query
		org.hibernate.Query query=session.createQuery("from Student");
		
		//implement pagination 
		query.setFirstResult(0);
		query.setMaxResults(3);
		
		List<Student> list=query.getResultList();
		
		for(Student s:list) {
			
			System.out.println(s.getName()+"-->"+s.getCity());
		}
		
		
		
		//write sql query
		/*
	    NativeQuery quer=session.createSQLQuery("select * from student");
		List<Object[]> list=quer.getResultList();
		
		for(Object[] s1:list) {
			
			System.out.println(Arrays.deepToString(s1));
		}
		
		*/
		session.close();				
		factory.close();
	}
}
