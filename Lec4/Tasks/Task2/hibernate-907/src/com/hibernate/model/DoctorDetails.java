package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity()
public class DoctorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String fukkAddress;
	
	private String firstName;
	
	private String lastName;
	
	private Integer age;
	
	@OneToOne()
	private Doctor doc;

	public DoctorDetails() {
		
	};
	public DoctorDetails(Integer id, String fukkAddress, String firstName,String lastName, Integer age,Doctor doc) {
		this.id=id;
		this.fukkAddress=fukkAddress;
		this.firstName = firstName;
		this.lastName=lastName;
		this.age = age;
		this.doc=doc;
	};
	public DoctorDetails(String fukkAddress, String firstName,String lastName, Integer age,Doctor doc) {
		this.fukkAddress=fukkAddress;
		this.firstName = firstName;
		this.lastName=lastName;
		this.age = age;
		this.doc=doc;
	};
	public void setId(Integer id)
	{
		this.id=id;
	}
	public Integer getId()
	{
		return id;
	}
	public void setFukkAddress(String fukkAddress)
	{
		this.fukkAddress=fukkAddress;
	}
	public String getFukkAddress()
	{
		return fukkAddress;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setAge(Integer age)
	{
		this.age=age;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setDoc(Doctor doc)
	{
		this.doc=doc;
	};
	public Doctor getDoc()
	{
		return doc;
	}
	@Override
	public String toString() {
	    return "DoctorDetails{" +
	            "id=" + id +
	            ", fukkAddress='" + fukkAddress + '\'' +
	            ", firstName='" + firstName + '\'' +
	            ", lastName='" + lastName + '\'' +
	            ", age =" + age +
	            '}';
	}
}
