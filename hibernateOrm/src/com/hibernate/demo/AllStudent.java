package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.jdbc.entity.Student;



public class AllStudent {
	public static void main(String[] args) {
		SessionFactory factory = new 
				Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
			List<Student> stdList = session.createQuery("from Student").list();
			for(Student std: stdList) {
				System.out.println(std);
			}
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}
}
