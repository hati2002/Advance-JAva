package com.onetoone.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "starting......." );
        
        //create a connection
        SessionFactory factory=new Configuration().configure("onetoone.cfg.xml").buildSessionFactory();
        
        //create questions class object
        Question ques=new Question();
        ques.setQuestionId(101);
        ques.setQuestions("what is hibernate");
        
        //create answer class object
        Answer answer=new Answer();
        answer.setAnswerId(301);
        answer.setAnswer("asdfghjkl");
        
       ques.setAnswer(answer);
       
       //create questions class object
       Question ques1=new Question();
       ques1.setQuestionId(102);
       ques1.setQuestions("what is java");
       
       //create answer class object
       Answer answer1=new Answer();
       answer1.setAnswerId(302);
       answer1.setAnswer("It is a programming language");
       
      ques1.setAnswer(answer1);
       
       //open session
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       
       //save the data
       session.save(ques);
       session.save(answer);
       session.save(ques1);
       session.save(answer1);
        tx.commit();
        factory.close();
        session.clear();
    }
}
