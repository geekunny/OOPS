package com.r177219086.q4;

import java.util.Scanner;
public class Test implements Storable{
	Integer div;
	Integer mod;
	
	@Override
	public void division(int div) {
		// TODO Auto-generated method stub
		this.div=div;
	}
	@Override
	public void modules(int mod) {
		// TODO Auto-generated method stub
		this.mod=mod;
	}

	public static void main(String args[]) {
		Test obj=new Test();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter division: ");
		obj.division(input.nextInt());
		System.out.print("Enter modules: ");
		obj.modules(input.nextInt());
		System.out.println("Content of division "+obj.div+" and modules "+obj.mod+" has been created.");
	}

}