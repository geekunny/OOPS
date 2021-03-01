package com.r177219086.q4;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=41;i<250;i++) {
			if(i%5==0)
				sum+=i;
		}
		System.out.println("Sum of all integers >40 and <250 is: "+sum);
	}

}
