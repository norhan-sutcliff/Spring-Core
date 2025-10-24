package com.hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity()
public class Teacher {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany
    @JoinTable(name="teacher_subject",
        joinColumns=@JoinColumn(name="teacher_id"),
        inverseJoinColumns=@JoinColumn(name="subject_id"))
    private List<Subject> subjects;
}
