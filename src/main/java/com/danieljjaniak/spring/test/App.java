package com.danieljjaniak.spring.test;

import org.springframework.context.ApplicationContext;

//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		// The bean container
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/danieljjaniak/spring/test/beans/beans.xml");
		
		// The directory can now be anywhere on the classpath and still find the XML file
		ApplicationContext context = new ClassPathXmlApplicationContext("com/danieljjaniak/spring/test/beans/beans.xml");
		
		//Person person = new Person();
		//person.speak();
		
		Person person = (Person)context.getBean("person");
		person.speak();
		
		Address address = (Address)context.getBean("address");
		System.out.println(address);
		
		System.out.print(person);
		

		//ApplicationContext does not have a close method
		//FileSystemXmlApplicationContext DOES have a close method 
		// Cast context to FileSystemXmlApplicationContext
		
		//((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
	}

}
