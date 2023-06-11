package com.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UseCriterial {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> list= criteria.list();
		System.out.println(list); 
		
		for(Student student : list)
		{
			System.out.println(student);
		}
		
		session.close();
		
		
		
		
	}

}
