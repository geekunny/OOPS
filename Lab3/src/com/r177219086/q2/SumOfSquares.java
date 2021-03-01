package com.r177219086.q2;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers in an array");
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<10;i++)
			sum+=arr[i]*arr[i];
		System.out.print(sum);
	}
	
}
