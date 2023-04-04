package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetails;

public class CreateNewCourseDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
			InstructorDetails ind  = new InstructorDetails("youtube.com",
					"video game");
			
			Instructor instructor = new Instructor("zahid","hasan",ind);
			Course course1 = new Course("Data structure");
			Course course2 = new Course("Algorithm");
			Course course3 = new Course("Git");
			
			
			
			
			
			instructor.add(course1);
			instructor.add(course2);
			instructor.add(course3);
			
			//session.save(instructor);
			session.save(course1);
			session.save(course2);
			session.save(course3);
			session.getTransaction().commit();
		} finally {
			session.close();
			factory.close();
		}
	}
}
