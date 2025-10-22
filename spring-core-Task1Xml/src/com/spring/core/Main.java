package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		PersonService personService = applicationContext.getBean("person", PersonService.class);
		personService.save("ahmed");
		personService.update("ahmed");
		
		MangerService mangerService = applicationContext.getBean("manger", MangerService.class);
		mangerService.save("nourhan");
		mangerService.update("nourhan");
		
		
		applicationContext.close();

	}

}
