package com.r177219086.q4;

public class Aa {
	private void finda(String s) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
				System.out.println("a occured at index: "+i);
			}
		}
		if(count==0)
			System.out.println("a is not present in the string");
		else
			System.out.println("No. of times a appeared: "+count+"\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Haardik";
		String s2="Ravi Sir";
		String s3="Object Oriented Programing Language";
		Aa s=new Aa();
		s.finda(s1);
		s.finda(s2);
		s.finda(s3);
	}

}