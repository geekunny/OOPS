package com.r177219086.q3;


public class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hashcode=0;
        hashcode=id*20;
        hashcode+=name.hashCode();
        return hashcode;
    }
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Employee) {
            Employee pp = (Employee) obj;
            return (pp.name.equals(this.name) && pp.id == this.id);
        } else 
            return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: "+id+" Name: "+name;
	}
}

