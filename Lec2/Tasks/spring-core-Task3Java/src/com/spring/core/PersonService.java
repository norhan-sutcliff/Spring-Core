package com.spring.core;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PersonService implements UserService{

	@Override
	public void save(String name) {
		System.out.println("Save...PersonService"+ name);
		
	}

	@Override
	public void update(String name) {
		System.out.println("update...PersonService"+ name);
		
	}
	@PostConstruct
	public void startApp()
	{
		System.out.println("Starting...PersonService");
	}
	@PreDestroy
	public void finishApp()
	{
		System.out.println("Finishing...PersonService");
	}

}
