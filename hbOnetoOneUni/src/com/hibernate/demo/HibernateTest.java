package com.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetails;



public class HibernateTest {
public static void main(String[] args) {
	SessionFactory factory = new 
			Configuration()
			.configure("hibernate-config.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(InstructorDetails.class)
			.buildSessionFactory();
	
	Session session = factory.getCurrentSession();
	try {
		
		session.beginTransaction();
		InstructorDetails insD = new InstructorDetails("youtube.com/programming","Gardening");
		Instructor ins = new Instructor("John","Doe",insD);
		session.save(ins);
		session.getTransaction().commit();
	}finally {
		factory.close();
	}
}
}
