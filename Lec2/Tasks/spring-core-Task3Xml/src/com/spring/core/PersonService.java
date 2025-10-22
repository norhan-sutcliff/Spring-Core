package com.spring.core;

public class PersonService implements UserService{

	@Override
	public void save(String name) {
		System.out.println("Save...PersonService"+ name);
		
	}

	@Override
	public void update(String name) {
		System.out.println("update...PersonService"+ name);
		
	}
	public void startApp()
	{
		System.out.println("Starting...PersonService");
	}
	public void finishApp()
	{
		System.out.println("Finishing...PersonService");
	}

}
