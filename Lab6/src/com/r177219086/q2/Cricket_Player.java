package com.r177219086.q2;

import java.util.Scanner; 

public final class Cricket_Player extends Player{

	Cricket_Player(String name){
		super(name);
	}
	
	public final void sport() {
		System.out.print(" and play Cricket.");
	}
	
	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		System.out.print("Name: "); 
		String name=input.next();
		Cricket_Player obj=new Cricket_Player(name);	
		obj.gk();
		obj.sport();
	}
}
