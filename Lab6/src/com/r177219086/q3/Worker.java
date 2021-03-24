package com.r177219086.q3;

public abstract class Worker {
	
	protected String name;
	protected float sr;
	
	Worker(String name, float sr){
		this.name=name;
		this.sr=sr;
	}
	protected void info() {
		System.out.println("Name: "+this.name+"\nSalary Rate: Rs "+this.sr);
	}
	protected Float ComPay(int hours) {
		return hours*this.sr;
	}
	protected Float ComPay() {
		return 40.0f*this.sr;
	}
}
