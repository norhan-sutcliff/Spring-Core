package com.spring.core;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.spring.core")
public class SpringConfig {



@Bean("person")
public PersonService personService ()
{
	return new PersonService();
}
}