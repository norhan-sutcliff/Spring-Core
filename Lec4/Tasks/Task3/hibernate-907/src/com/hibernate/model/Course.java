package com.hibernate.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity()
public class Course {
	 @Id()
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String courseName;

	    @ManyToMany
	    @JoinTable(name="course_student",
	        joinColumns=@JoinColumn(name="course_id"),
	        inverseJoinColumns=@JoinColumn(name="student_id"))
	    private List<Student> students;
}
