package com.r177219086.q1;

import java.util.Scanner;

public class Combinatons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter first number: ");  
		int a=sc.nextInt();  
		System.out.print("Enter second number: ");  
		int b=sc.nextInt();  
		System.out.print("Enter third number: ");  
		int c=sc.nextInt(); 
		int[] arr= {a,b,c};
		for (int x=0;x<3;x++){
			for (int y=0;y<3;y++) {
			    for (int z=0;z<3;z++){
			    	if (x!=y && y!=z && z!=x)
			    		System.out.println(arr[x]+" "+arr[y]+" "+arr[z]);
			    }
			}
		}
	}
}
