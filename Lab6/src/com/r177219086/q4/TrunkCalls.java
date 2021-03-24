package com.r177219086.q4;
public class TrunkCalls {
	Float o,u,l;
	TrunkCalls(){
		this.o = 2.3f;
		this.u = 2.7f;
		this.l = 2.9f;
	}
	private Float charge(int type, float duration) {
		return o*duration;
	}
	
	private Float charge(int type, double duration) {
		return u*(float)duration;
	}
	
	private Float charge(float duration) {
		return l*duration;
	}
	
	public static void main(String[] args) {
		TrunkCalls ocall = new TrunkCalls(); 
		TrunkCalls ucall = new TrunkCalls();
		TrunkCalls lcall = new TrunkCalls();
		System.out.println("Ordinary Call charges: "+ocall.charge(1,25.0f));
		System.out.println("Urgent Call charges: "+ucall.charge(2,25.0));
		System.out.println("Lightning Call charges: "+lcall.charge(25.0f));
	}
}