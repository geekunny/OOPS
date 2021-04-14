package Thirteen.April;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DemoThread obj1=new DemoThread("Worker-1");
		DemoThread obj2=new DemoThread("Worker-2");
		DemoThread obj3=new DemoThread("Worker-3");
		DemoThread obj4=new DemoThread("Worker-4");
		obj1.start(); //Start is an inbuilt method to run thread-->> Create Thread--> Call run method
		obj2.start();
		System.out.println(obj1.isAlive()); //Check is obj1 thread is alive or not
		obj3.start();
		obj1.join(); //Lines after this will only be executed once obj1 thread is completed
		obj4.start();
		System.out.println(obj1.isAlive()); //Check is obj1 thread is alive or not
		
//		What if we want to execute something after all threads are being executed?
//		Solution-1 = while(obj1.isAlive()||obj2.isAlive()||obj3.isAlive()||obj4.isAlive());
		
//		OR
//		Solution-2 = 
		
		obj1.join();
		obj2.join();
		obj3.join();
		obj4.join();
		
		System.out.println("\nLast line of the program");
	}
}
