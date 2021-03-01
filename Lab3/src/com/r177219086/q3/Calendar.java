package com.r177219086.q3;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		String[] months= {"Jan","Feb","Mar","Apr",
				"May","Jun","Jul","Aug","Sep",
				"Oct","Nov","Dec"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of month: ");
		int no=sc.nextInt();
		System.out.println("Month: "+months[no-1]);
	}

}
