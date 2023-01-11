package com.embedded.MyEmbedded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "started........" );
        
        SessionFactory factory=new Configuration().configure("Embedded.cfg.xml").buildSessionFactory();
        
        //create student class object
        Student student=new Student();
        student.setName("suman");
        student.setLocation("Kolkata");
        
        //create certificate class object
        Certificate certificate=new Certificate();
        certificate.setCourse("Java");
        certificate.setDuration("3 month");
        
        student.setCerti(certificate);
        
        //open the session
        Session session=factory.openSession();
        
        //save the data
        Transaction transaction=session.beginTransaction();
        session.save(student);
        transaction.commit();
        
        session.close();
        factory.close();
    }
}
