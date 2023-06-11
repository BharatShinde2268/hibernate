package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project Started" );
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       
       Student std=new Student();
       std.setId(101);
       std.setName("Bharat Shinde");
       std.setCity("Renapur");
       std.setPhone("8007000562");
       System.out.println(std);
       
       Session currentSession = sf.openSession();
       Transaction tx = currentSession.beginTransaction();
       currentSession.save(std);
       tx.commit();
       
       currentSession.close();
       
       
       
    }
}
