package com.spring.core;

public class MangerService implements UserService {

	@Override
	public void save(String name) {
		System.out.println("Save...MangerService"+ name);
		
	}

	@Override
	public void update(String name) {
		System.out.println("update...MangerService"+ name);
		
	}
	

}
