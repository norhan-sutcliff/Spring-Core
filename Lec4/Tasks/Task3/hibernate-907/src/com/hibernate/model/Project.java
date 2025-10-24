package com.hibernate.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity()
public class Project {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String projectName;

    @ManyToMany
    @JoinTable(name="project_employee",
        joinColumns=@JoinColumn(name="project_id"),
        inverseJoinColumns=@JoinColumn(name="employee_id"))
    private List<Employee> employees;
}
