package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main (String[] args) {
		//Launch Spring content:
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		
		//Retrieving bean manage by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("adress2"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("person4Parameter"));
        System.out.println(context.getBean("person5Parameter"));
		
		
		
		
		
	}
}
