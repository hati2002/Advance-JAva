package com.onetomany.ManyMap;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start......" );
        
        //create a connection
        SessionFactory factory=new Configuration().configure("ManyMap.cfg.xml").buildSessionFactory();
        
        //create question class object
        Question q=new Question();
        q.setQuestionId(101);
        q.setQuestions("what is java");
        
        //create answer class object
        Answer ans1=new Answer();
        ans1.setAnswerId(201);
        ans1.setAnswer("programming language");
        ans1.setQuestion(q);
        
        Answer ans2=new Answer();
        ans2.setAnswerId(202);
        ans2.setAnswer("It is object oriented");
        ans2.setQuestion(q);
        
        List<Answer> list=new ArrayList<Answer>();
        list.add(ans1);
        list.add(ans2);
        
        q.setAnswers(list);
        
        //open session
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        
        //save the data
        session.save(q);
        session.save(ans1);
        session.save(ans2);
        
        transaction.commit();
        session.close();
        factory.close();
    }
}
