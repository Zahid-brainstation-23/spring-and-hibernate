package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetails;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class AddMoreStudentToCourse {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
			
			
			Course course = session.get(Course.class, 16);
			Student student1 = new Student("z1","hasan1","e1@gmail.com");
			Student student2 = new Student("z2","hasan2","e2@gmail.com");
			Student student3 = new Student("z3","hasan3","e3@gmail.com");

			course.addStudent(student1);
			course.addStudent(student2);
			course.addStudent(student3);
			
			
			
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			/*
			
			Student student = session.get(Student.class, 3);
			
			Course course1 = new Course("c1");
			Course course2 = new Course("c2");
			
			course1.addStudent(student);
			course2.addStudent(student);
			
			session.save(course1);
			session.save(course2);
			*/
			session.getTransaction().commit();
		} finally {
			
			factory.close();
		}
	}
}
