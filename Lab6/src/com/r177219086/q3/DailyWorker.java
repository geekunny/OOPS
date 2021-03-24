package com.r177219086.q3;

public class DailyWorker extends Worker {
	private float wage;
	
	DailyWorker(String name, float sr){
		super(name,sr);
		wage=0.0f;
	}
	private void out() {
		this.info();
		System.out.println("Salary: Rs "+ this.wage);
	}
	public static void main(String[] args) {
		DailyWorker obj=new DailyWorker("Ram",1000.2f);
		obj.wage=obj.ComPay(37);
		obj.out();
	}
}
