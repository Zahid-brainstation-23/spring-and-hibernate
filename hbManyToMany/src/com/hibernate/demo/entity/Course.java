package com.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.bytebuddy.implementation.bytecode.Addition;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "instructor_id")
	private Instructor instructorId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	private List<Review> reviews;
	
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(
			name ="course_student",
			joinColumns =@JoinColumn(name="course_id"),
			inverseJoinColumns=@JoinColumn(name="student_id")
			)
	private List<Student> students;
	
	Course(){
		
		
	}
	
	

	public Course(String title) {
		super();
		this.title = title;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public Instructor getInstructorId() {
		return instructorId;
	}



	public void setInstructorId(Instructor instructorId) {
		this.instructorId = instructorId;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}



	public List<Review> getReviwes() {
		return reviews;
	}



	public void setReviwes(List<Review> reviwes) {
		this.reviews = reviwes;
	}
	
	public void addReview(Review review) {
		if(reviews==null) {
			reviews = new ArrayList<>();
		}
		reviews.add(review);
	}
	
	public void addStudent(Student student) {
		if(students==null) {
			students = new ArrayList<Student>();
		}
		students.add(student);
	}

	
	

	

}
