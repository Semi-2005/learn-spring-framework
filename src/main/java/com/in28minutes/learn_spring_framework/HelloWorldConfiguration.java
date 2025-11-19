package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name , int age,Adress adress) {};

record Adress(String street,String city) {};


@Configuration
public class HelloWorldConfiguration {
	
	
	@Bean
	public  String name() {
		return "Semi";
	}

	@Bean
	public  int age() {
		return 20;
	}
	
	
	public  String Street() {
		return "Baker Street";
	}
	public  String City() {
		return "London";
	}
	
	@Bean
	public Person person() {
		return new Person("Ali",18,new Adress("Besiktas","Istanbul"));
	}
	
	@Bean( name = "adress2")
	public Adress adress() {
		return new Adress("Baker Street","London");
	}
	

	
	
	@Bean 
	public Person person2MethodCall() {
		return new Person(name(),age(),adress());
	}
	
	@Bean
	public Person person3Parameter(String name , int age , Adress adress ) {
		return new Person(name,age,adress);
	}
	
	
}
