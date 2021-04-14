package Thirteen.April;

public class Solution1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Problem obj1=new Problem("Worker-1");
		Problem obj2=new Problem("Worker-2");
		Problem obj3=new Problem("Worker-3");
		Problem obj4=new Problem("Worker-4");
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		Thread t4=new Thread(obj4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
