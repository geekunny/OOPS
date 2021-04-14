package Thirteen.April;

public class Solution2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Problem obj1=new Problem("Worker-1");
		Problem obj2=new Problem("Worker-2");
		Problem obj3=new Problem("Worker-3");
		Problem obj4=new Problem("Worker-4");

		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj1.run();
			}
		};
		Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj2.run();
			}
		};
		Runnable r3=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj3.run();
			}
		};
		Runnable r4=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj4.run();
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		Thread t4=new Thread(r4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
