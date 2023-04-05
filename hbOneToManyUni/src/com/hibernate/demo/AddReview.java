package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetails;
import com.hibernate.demo.entity.Review;

public class AddReview {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
			Course course = new Course("Hellow world");
			course.addReview(new Review("Good course"));
			course.addReview(new Review("bad course"));
			course.addReview(new Review("very Good course"));
			session.save(course);
			session.getTransaction().commit();
		} finally {
			
			factory.close();
		}
	}
}
