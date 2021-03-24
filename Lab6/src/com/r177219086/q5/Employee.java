package com.r177219086.q5;

public class Employee {
	private String name;
	private  String id;
	private  Float salary;
	
	Employee(String name, String id, Float salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	protected String getName() {
		return this.name;
	}
	protected Float getSalary() {
		return this.salary;
	}
	protected void increaseSalary(Float inc) {
		this.salary+=(inc*this.salary);
	}

}