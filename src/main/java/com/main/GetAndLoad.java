package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAndLoad {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		// using get method 
		
		Student student =(Student) session.get(Student.class, 101);
		System.out.println(student);
		
		// using load method
		
		Student std1=(Student) session.load(Student.class, 102);
		System.out.println(std1.getName());
		
		session.close();
		sf.close();
		
		
		
		
		
	}

}
