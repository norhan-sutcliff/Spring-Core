package com.spring.core;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class); 
		
		PersonService personService =  applicationContext.getBean("person",PersonService.class);
		personService.save("norhan");
		personService.update("norhan");
		
		PersonService personServicecopy =  applicationContext.getBean("person",PersonService.class);
		personServicecopy.save("mariem");
		personServicecopy.update("mariem");
		
		System.out.println(personServicecopy==personService);
		
		personService.finishApp();
		personServicecopy.finishApp();

        applicationContext.close(); 
		
	}

}
