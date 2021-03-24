package com.r177219086.q2;

import java.util.Scanner; 

public final class Hockey_Player extends Player{

	Hockey_Player(String name){
		super(name);
	}
	
	public final void sport() {
		System.out.print(" and play Hockey. Position: Goal Keeper");
	}
	
	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		System.out.print("Name: "); 
		String name=input.next();
		Hockey_Player obj=new Hockey_Player(name);	
		obj.gk();
		obj.sport();
	}
}
