package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetails;

public class BidirectionalTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {

			session.beginTransaction();
			InstructorDetails is= session.get(InstructorDetails.class, 3);
			session.delete(is);
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}
