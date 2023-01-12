package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CascadeExample {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		//create question class object
		Question question1=new Question(1001, "what is java");

		
		
		//create answer class object
		Answer answer1=new Answer(121, "programing language");
		Answer answer2=new Answer(122, "platform independent");
		Answer answer3=new Answer(123, "object oriented");
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);

		question1.setAnswers(list);
		session.save(question1);
		
		Transaction tx=session.beginTransaction();
		tx.commit();
		
		
		session.close();
		factory.close();
	}
}
