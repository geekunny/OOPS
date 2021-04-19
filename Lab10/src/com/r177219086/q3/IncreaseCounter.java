package com.r177219086.q3;

public class IncreaseCounter extends Thread{
	static int counter=0;
	synchronized void plusPlus() throws InterruptedException {
		++counter;
		System.out.println(Thread.currentThread().getName()+" Counter- "+(counter));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			plusPlus();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreaseCounter[] t=new IncreaseCounter[10];
		for(int i=0;i<10;i++)
			t[i]=new IncreaseCounter();
		for(int i=0;i<10;i++)
			t[i].start();
	}
}
