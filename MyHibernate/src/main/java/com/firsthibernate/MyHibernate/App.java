package com.firsthibernate.MyHibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started........." );
        
        //connection
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
       
        //creating object of student
     Student s=new Student();
     s.setId(2);
     s.setFirstname("suman");
     s.setLastname("Hati");
     s.setCity("kolkata");
     
     
     //creating address class object
     Address address=new Address();
     address.setCityString("Bhubaneswar");
     address.setStreet("street");
     address.setAddedDate(new Date());
     
     Session session=factory.openSession();
     
     Transaction tx=session.beginTransaction(); //transaction is used for save the data
     session.save(s);
//     session.save(address);
     tx.commit();
     
     session.close();
     System.out.println("done.........");
    }
}
