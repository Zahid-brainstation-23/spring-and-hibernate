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
			
			Student student1 = new Student("zahid1", "hasan", "z@gmail.com");
			Student student2 = new Student("zahid2", "hasan", "z@gmail.com");
			Student student3 = new Student("zahid3", "hasan", "z@gmail.com");
			session.beginTransaction();
			session.save(student1);
			session.save(student2);
			session.save(student3);
			session.getTransaction().commit();
		}finally {
			factory.close();
		}
	}
}
