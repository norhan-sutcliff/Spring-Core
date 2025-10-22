package com.spring.core;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PersonService personService =  applicationContext.getBean("person",PersonService.class);
		
		AccountServiceImpl acctService =  applicationContext.getBean("account",AccountServiceImpl.class);
		acctService.setUserService(personService);
		acctService.getSavePerson("Norhan");
		
		
	}

}
