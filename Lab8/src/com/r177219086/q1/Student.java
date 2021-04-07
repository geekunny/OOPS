package com.r177219086.q1;

import java.util.Scanner;

public class Student {
	String name;
	String roll;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] s=new Student[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			s[i]=new Student();
			System.out.print("Student-"+(i+1)+" name- ");
			s[i].name=sc.nextLine();
			System.out.print("Roll No.- ");
			s[i].roll=sc.nextLine();
		}
		System.out.print("Which student details you want to acquire? Student-");
		int index=sc.nextInt();
		try {
			System.out.println("Student-"+index+" name- "+s[index-1].name+" Roll no.- "+s[index-1].roll);
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("Index is out of bound");
			System.out.println(obj);
		}
	}
}
