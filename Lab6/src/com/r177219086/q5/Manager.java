package com.r177219086.q5;

public class Manager extends Employee{
	private String department;
	Manager(String name, String id,Float salary,String department){
		super(name,id,salary);
		this.department=department;
	}
	
	public static void main(String[] args) {
		Manager m1=new Manager("Haardik","500076610",10000.0f,"AIML");
		System.out.println("Name: " +m1.getName());
		System.out.println("Salary: "+m1.getSalary());
		m1.increaseSalary(10.0f);
		System.out.println("Salary with an increment of 10%: Rs "+m1.getSalary());
	}
}