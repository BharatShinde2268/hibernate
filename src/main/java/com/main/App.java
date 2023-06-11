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
       Session session = sf.openSession();
       
       Student std=new Student();
       std.setId(104);
       std.setName("Bharat Shinde");
       std.setCity("Renapur");
       std.setPhone("8007000562");
       System.out.println(std);
       
       
       Student std1=new Student();
       std.setId(105);
       std.setName("khandu Shinde");
       std.setCity("Renapur");
       std.setPhone("9765616246");
       System.out.println(std1);
       
       
       Transaction tx = session.beginTransaction();
       session.save(std);
       session.save(std1);
       tx.commit();
       
       session.close();
       
       
       
    }
}
