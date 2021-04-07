package com.r177219086.q5;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	public Employee(String name,int Age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		System.out.println("Object of an Employee with these details created.");
	}
	
	public static void main(String[] args) throws NameException, AgeException {
		// TODO Auto-generated method stub
		String empName;
		int empAge;
		System.out.print("Employee name: ");
		Scanner sc=new Scanner(System.in);
		empName=sc.nextLine();
		for(int i=0;i<empName.length();i++) {
			if(Character.isDigit((char)empName.charAt(i))) {
				throw new NameException("Name can not be Alphanumeric");
			}
		}
		System.out.print("Employee age: ");
		empAge=sc.nextInt();
		if(empAge>50) {
			throw new AgeException("Age cannot be greater than 50.");
		}
		Employee e1=new Employee(empName,empAge);
	}

}
