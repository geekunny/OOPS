package assignment.three;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1=new ChildThread();
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main thread executing.");
		}
	}

}