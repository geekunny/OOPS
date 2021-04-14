package Thirteen.April;

public class DemoThread extends Thread{
	String name;
	public DemoThread(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	public void myWork() throws InterruptedException { //action-->piece of work to be done.
		// TODO Auto-generated method stub
		System.out.println("This is me.."+name);
		System.out.println("My name is "+Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			Thread.currentThread().sleep(1000); //making it to sleep for 1 second
			System.out.print(" "+i);
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			myWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//Problem - What if DemoThread is in inheritance with some other class and cannot extends Thread class
