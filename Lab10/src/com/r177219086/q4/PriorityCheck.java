package com.r177219086.q4;

public class PriorityCheck extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		Thread t4=new Thread();
		Thread t5=new Thread();
		t1.setPriority(4);
		t2.setPriority(10);
		t3.setPriority(7);
		t4.setPriority(8);
		t5.setPriority(3);
		t2.sleep(1000);
		t4.sleep(1000);
		t1.start();
		t3.start();
		t5.start();
		if (t1.isAlive())
			System.out.println("Thread-1 alive");
		if (t2.isAlive())
			System.out.println("Thread-2 alive");
		if (t3.isAlive())
			System.out.println("Thread-3 alive");
		if (t4.isAlive())
			System.out.println("Thread-4 alive");
		if (t5.isAlive())
			System.out.println("Thread-5 alive");
		
	}

}
