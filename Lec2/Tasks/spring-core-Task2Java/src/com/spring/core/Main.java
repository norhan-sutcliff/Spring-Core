package com.spring.core;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class); 
		
		PersonService personService =  applicationContext.getBean("person",PersonService.class);
		
		AccountServiceImpl acctService =  applicationContext.getBean("account",AccountServiceImpl.class);
		acctService.setUserService(personService);
		acctService.getSavePerson("Norhan");
		
		
	}

}
