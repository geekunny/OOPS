package com.r177219086.q2;

public abstract class Player {
	
	protected String name;
	
	Player(String name){
		this.name = name;
	}
	protected void gk() {
		System.out.print(this.name+" is a player");
	}
}
