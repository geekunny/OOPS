package com.r177219086.q2;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=0;
		try {
			System.out.println("25 divided by "+b+" = "+(a/b));
		}
		catch(ArithmeticException obj) {
			System.out.println("Denominator can not be Zero.");
			System.out.println(obj);
		}
		
	}

}
