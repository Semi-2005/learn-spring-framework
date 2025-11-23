package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
};

record Address(String street, String city) {
};


@Configuration
public class HelloWorldConfiguration {


    @Bean
    public String name() {
        return "Semi";
    }

    @Bean(name = "Name2")
    public String name2() {
        return "Zeynep";
    }

    @Bean
    public int age() {
        return 20;
    }


    public String Street() {
        return "Baker Street";
    }

    public String City() {
        return "London";
    }

    @Bean
    public Person person() {
        return new Person("Ali", 18, new Address("Besiktas", "Istanbul"));
    }

    @Bean(name = "address")
    public Address address() {
        return new Address("Baker Street", "London");
    }


    @Bean(name = "address3")
    public Address address3() {
        return new Address("Baker Street", "Sivas");
    }


    @Bean
    public Person person2MethodCall() {
        return new Person(name2(), age(), address());
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    public Person person4Parameter(String name, int age, Address address) {
        return new Person(name, age, address);
    }


}
