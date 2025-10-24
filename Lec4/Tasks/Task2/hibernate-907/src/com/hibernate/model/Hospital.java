package com.hibernate.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity()
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	private Integer numberOfDoctors;
	
	private Integer numberOfPatient;
	
	@OneToMany(mappedBy ="hospital")
	private List<Doctor> doctors;
	
	@ManyToMany(mappedBy ="hospitals")
	private List<Patient> patients;
	
	public Hospital() {
		
	};
	public Hospital(Integer id,String name,Integer numberOfDoctors, Integer numberOfPatient,List<Doctor> doctors,List<Patient> patients) {
		this.id=id;
		this.name=name;
		this.numberOfDoctors=numberOfDoctors;
		this.numberOfPatient=numberOfPatient;
		this.doctors=doctors;
		this.patients=patients;
	};
	public Hospital(String name,Integer numberOfDoctors, Integer numberOfPatient,List<Doctor> doctors,List<Patient> patients) {
		this.name=name;
		this.numberOfDoctors=numberOfDoctors;
		this.numberOfPatient=numberOfPatient;
		this.doctors=doctors;
		this.patients=patients;
	};
	public void setId(Integer id)
	{
		this.id=id;
	}
	public Integer getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setNumberOfDoctors(Integer numberOfDoctors)
	{
		this.numberOfDoctors=numberOfDoctors;
	}
	public Integer getNumberOfDoctors()
	{
		return numberOfDoctors;
	}
	public void setNumberOfPatient(Integer numberOfPatient)
	{
		this.numberOfPatient=numberOfPatient;
	}
	public Integer getNumberOfPatient()
	{
		return numberOfPatient;
	}
	public void setDoctors(List<Doctor> doctors)
	{
		this.doctors=doctors;
	}
	public List<Doctor> getDoctors()
	{
		return doctors;
	}
	public void setPatients(List<Patient> patients)
	{
		this.patients=patients;
	}
	public List<Patient> getPatients()
	{
		return patients;
	}
	@Override
	public String toString() {
	    return "Hospital{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", numberOfDoctors=" + numberOfDoctors +
	            ", numberOfPatient=" + numberOfPatient +
	            '}';
	}
}
