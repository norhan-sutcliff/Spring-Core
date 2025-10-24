package com.hybernate.files;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity()
public class Teacher {
	@Id
	private int id;
	@Column(length = 50)
	private String name; 
	private int age;
	@Column(unique=true)
	private String address; 
	
	public Teacher() {
	}
	public Teacher(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 15 || age > 20)
            throw new IllegalArgumentException("Age must be between 15 and 20");
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
}
