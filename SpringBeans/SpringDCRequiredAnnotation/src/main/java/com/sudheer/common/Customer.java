package com.sudheer.common;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
	private Person person;
	 
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Person person) {
		this.person = person;
	}
    @Required
	public void setPerson(Person person) {
		this.person = person;
	}
 
	@Override
	public String toString() {
		return "Customer [person=" + person + "]";
	}
}
