package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(length=10)
	private Integer age;
	
	private boolean status;

	public Player() {
		
	};
	public Player(Integer id, String name,Integer age,boolean status) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.status=status;
	}
	public Player(String name,Integer age,boolean status) {
		this.name=name;
		this.age=age;
		this.status=status;
	}
	
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
	public void setAge(Integer age)
	{
		this.age=age;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setStatus(boolean status)
	{
		this.status=status;
	}
	public boolean getStatus()
	{
		return status;
	}
	@Override
	public String toString() {
	    return "Player{" +
	            "id=" + id +
	            ", name='" + name + '\'' +
	            ", age=" + age +
	            ", status=" + status +
	            '}';
	}

}
