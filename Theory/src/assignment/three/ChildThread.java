package assignment.three;

public class ChildThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println("Child thread executing.");
		}
	}
}