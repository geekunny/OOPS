package com.r177219086.Q1;

import java.util.Scanner;

public class ClassO implements InterF{
	static Integer x;
	static Integer y;
	public void division(int div) {
		x=div;
	}
	public void modules(int mod) {
		y=mod;
	}
	void details(int div,int mod) {
		System.out.println("Division: "+x);
		System.out.println("Modules: "+y);
	}
	public static void main(String args[]) {
		ClassO obj=new ClassO();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter division: ");
		obj.division(input.nextInt());
		System.out.print("Enter modules: ");
		obj.modules(input.nextInt());
		obj.details(x,y);
	}
}
	