package com.spring.core;

public class AccountServiceImpl implements AccountService {

	private PersonService personService;
	
	public void setUserService(PersonService personService) {
        this.personService = personService;
    }
	
	@Override
	public void getSavePerson(String name) {
		System.out.println("getSavePerson..named " + name);
		personService.save(name);
	
	}
	

}
