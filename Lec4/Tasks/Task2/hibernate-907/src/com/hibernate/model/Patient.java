package com.hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.UniqueConstraint;

@Entity()
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String typeOfDisease;
	
	@ManyToOne()
	@JoinColumn(nullable=false)
	private Doctor doctor;
	
	@ManyToMany()
	@JoinTable(name = "Patient_Group_Hospital",joinColumns=@JoinColumn(name="patiend_id"),inverseJoinColumns=@JoinColumn(name = "hospital_id"),
	uniqueConstraints= {@UniqueConstraint(columnNames= {"patiend_id","hospital_id"})})
	private List<Hospital> hospitals;
	
	public Patient() {
		
	};
	public Patient(Integer id,String name, String typeOfDisease,Doctor doctor,List<Hospital> hospitals) {
		this.id=id;
		this.name=name;
		this.typeOfDisease=typeOfDisease;
		this.doctor=doctor;
		this.hospitals=hospitals;
	};
	public Patient(String name, String typeOfDisease,Doctor doctor,List<Hospital> hospitals) {
		this.name=name;
		this.typeOfDisease=typeOfDisease;
		this.doctor=doctor;
		this.hospitals=hospitals;
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
	public void setTypeOfDisease(String typeOfDisease)
	{
		this.typeOfDisease=typeOfDisease;
	}
	public String getTypeOfDisease()
	{
		return typeOfDisease;
	}
	public void setDoctor(Doctor doctor)
	{
		this.doctor=doctor;
	}
	public Doctor getDoctor()
	{
		return doctor;
	}
	public void setHospitals(List<Hospital> hospitals)
	{
		this.hospitals=hospitals;
	}
	public List<Hospital> getHospitals()
	{
		return hospitals;
	}
	@Override
	public String toString() {
	    return "Patient{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", typeOfDisease='" + typeOfDisease +'\'' +
	            '}';
	}
}
