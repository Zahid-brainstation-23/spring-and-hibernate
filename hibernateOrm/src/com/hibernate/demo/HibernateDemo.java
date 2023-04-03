package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.jdbc.entity.Student;

public class HibernateDemo {
	public static void main(String[] args) {
		SessionFactory factory = new 
				Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			
			Student student = new Student("zahid", "hasan", "z@gmail.com");
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}
}
