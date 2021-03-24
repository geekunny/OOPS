package com.r177219086.q1;

public final class Child extends Parent{
	int A;
	
	Child(){
		super();
		A=20;
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println("Parent a: "+a);
		System.out.println("Child a: "+obj.A);
	}
}
