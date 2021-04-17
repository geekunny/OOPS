package assignment.three;

public class Resource {
	public synchronized void myWork() throws InterruptedException {
		// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName()+" Started");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" Finished");
	}
}
