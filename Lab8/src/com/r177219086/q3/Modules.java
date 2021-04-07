package com.r177219086.q3;

public class Modules {

	public static void main(String[] args) throws NonNumericException { 
		// TODO Auto-generated method stub
		int a;
		try {
			a=Integer.valueOf(args[0]);
			System.out.println(a/2);
		}
		catch(NumberFormatException obj) {
//			System.out.println(obj);
			throw new NonNumericException("Should be Numeric");
		}
		
	}

}
