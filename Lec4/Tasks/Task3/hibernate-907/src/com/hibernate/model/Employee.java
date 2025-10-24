package com.hibernate.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity()
public class Employee {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String empName;

    @ManyToOne
    private Department department;
    
    @ManyToMany(mappedBy="employees")
    private List<Project> projects;
}
