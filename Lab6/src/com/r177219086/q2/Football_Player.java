package com.r177219086.q2;

import java.util.Scanner; 

public final class Football_Player extends Player{

	Football_Player(String name){
		super(name);
	}
	
	public final void sport() {
		System.out.print(" and play Football. Possition: Stricker");
	}
	
	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		System.out.print("Name: "); 
		String name=input.next();
		Football_Player obj=new Football_Player(name);	
		obj.gk();
		obj.sport();
	}
}
