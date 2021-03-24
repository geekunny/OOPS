package com.r177219086.Q2;

public class Employee implements Cloneable {
	Integer id;
	String name;
	Department dep;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDep(Department dep) {
		this.dep=dep;
	}
	public Department getDep() {
		return dep;
	}
	Employee(int id,String name,Department dep){
		this.id=id;
		this.name=name;
		this.dep=dep;
	}
	public void show() {
		System.out.println("Employe Name: "+this.name);
		System.out.println("Employee Id: "+this.id);
		System.out.println("Deparment Id: "+this.dep.id);
		System.out.println("Department Name: "+this.dep.name);
	}
	public Employee clone(Employee emp2) throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dep1=new Department(12,"AIML");
		Employee emp1=new Employee(1234,"Haardik",dep1);
		Employee emp2=(Employee) emp1.clone(emp1);
		emp2.setId(56);
		emp2.setName("Hunny");
		emp2.show();
	}
}
