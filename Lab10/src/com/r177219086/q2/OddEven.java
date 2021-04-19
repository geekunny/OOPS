package com.r177219086.q2;

public class OddEven extends Thread {
	void printing() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			if(Thread.currentThread().getName()=="Even"&&(i%2)==0) {
				System.out.println("Even- "+i+" ");
			}
			Thread.sleep(1000);
			if(Thread.currentThread().getName()=="Odd"&&(i%2)!=0) {
				System.out.println("Odd- "+i+" ");
			}
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			printing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEven oe1=new OddEven();
		OddEven oe2=new OddEven();
		Thread t1= new Thread(oe1,"Even");
		Thread t2= new Thread(oe2,"Odd");
		t1.start();
		t2.start();
	}

}
