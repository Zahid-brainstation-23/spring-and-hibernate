package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.jdbc.entity.Student;

public class ReadStudent {
	public static void main(String[] args) {
		SessionFactory factory = new 
				Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
			Student student = session.get(Student.class, 8);
			System.out.println(student);
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}
}
