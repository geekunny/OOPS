package com.r177219086.q5;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] marks=new int[10];
		System.out.println("Enter the marks of 10 students: ");
		for(int i=0;i<10;i++) {
			marks[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<10;i++) {
			int key=marks[i];
			int j=i-1;
			while(j>=0 && marks[j]>key) {
				marks[j+1]=marks[j];
				j=j-1;
			}
			marks[j+1]=key;
		}
		for(int i=0;i<10;i++) {
			if(marks[i]>=40 && marks[i]<=50)
				System.out.println("Marks: "+marks[i]+"  Grade: PASS");
			else if(marks[i]>=51 && marks[i]<=75)
				System.out.println("Marks: "+marks[i]+"  Grade: MERIT");
			else if(marks[i]>=76 && marks[i]<=100)
				System.out.println("Marks: "+marks[i]+"  Grade: DISTINCTION");
			else if(marks[i]>=0)
				System.out.println("Marks: "+marks[i]+"  Grade: FAIL");
		}
		
	}

}
