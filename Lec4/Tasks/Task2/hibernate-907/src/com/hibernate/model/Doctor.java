package com.hibernate.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity()
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String userName;
	
	private Integer salary;
	
	@OneToOne(mappedBy = "doc")
	private DoctorDetails docDetails;
	
	@ManyToOne()
	@JoinColumn(nullable=false)
	private Hospital hospital;
	
	@OneToMany(mappedBy ="doctor")
	private List<Patient> patients;
	
	public Doctor() {
		
	};
	public Doctor(Integer id, String userName,Integer salary,DoctorDetails docDetails,Hospital hospital,List<Patient> patients) {
		this .id=id;
		this.userName=userName;
		this.salary=salary;
		this.docDetails=docDetails;
		this.hospital=hospital;
		this.patients=patients;
	};
	public Doctor(String userName,Integer salary,DoctorDetails docDetails,Hospital hospital,List<Patient> patients) {
		this.userName=userName;
		this.salary=salary;
		this.docDetails=docDetails;
		this.hospital=hospital;
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
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setSalary(Integer salary)
	{
		this.salary=salary;
	}
	public Integer getSalary()
	{
		return salary;
	}
	public void setDocDetails(DoctorDetails docDetails)
	{
		this.docDetails=docDetails;
	};
	public DoctorDetails getDocDetails()
	{
		return docDetails;
	}
	public void setHospital(Hospital hospital)
	{
		this.hospital=hospital;
	};
	public Hospital getHospital()
	{
		return hospital;
	}
	public void setPatients(List<Patient> patients)
	{
		this.patients=patients;
	};
	public List<Patient> getPatients()
	{
		return patients;
	}
	@Override
	public String toString() {
	    return "Doctor{" +
	            "id=" + id +
	            ", name='" + userName + '\'' +
	            ", salary=" + salary +
	            '}';
	}
}
