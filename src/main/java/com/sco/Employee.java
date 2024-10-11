package com.sco;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Employee {
	private String name;
	
	@Value("Nisha")
	public void setName(String a) {
		name= a;
	}
	public String getName() {
		return name;
	}
	
	public Employee() {
		System.out.println("bean is created");
	}
	
	public String toString() {
		return name;
	}

}
