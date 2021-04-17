package assignment.three;

public class MyThread1 extends Thread{
	Resource r;
	public MyThread1(Resource r) {
		// TODO Auto-generated constructor stub
		this.r=r;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			r.myWork();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Resource r1=new Resource();
		MyThread1 t1=new MyThread1(r1);
		MyThread1 t2=new MyThread1(r1);
		t1.start();
		t2.start();
	}
}
