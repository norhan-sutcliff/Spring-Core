package com.spring.core;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class); 
		PersonService userService =  applicationContext.getBean("person",PersonService.class);
		userService.save("Norhan");
		userService.update("Norhan");
		MangerService userService2 =  applicationContext.getBean("manger",MangerService.class);
		userService2.save("Norhan");
		userService2.update("Norhan");
	}

}
