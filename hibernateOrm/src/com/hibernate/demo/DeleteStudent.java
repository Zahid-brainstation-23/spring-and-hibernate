package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.jdbc.entity.Student;

public class DeleteStudent {
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
			session.delete(student);
			
			session.getTransaction().commit();
			
		}finally {
			factory.close();
		}
	}
}
