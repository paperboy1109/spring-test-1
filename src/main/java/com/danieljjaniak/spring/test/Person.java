package com.danieljjaniak.spring.test;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;
	

	// No-argument constructor
	public Person() {
		
	}

	// Constructor
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void speak() {
		System.out.println("Hello, Daniel!");
	}


	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	
	
	// For dependency injection 
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	
	

}
