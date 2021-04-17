package assignment.three;

public class MyThread2 implements Runnable{
	Resource r;
	public MyThread2(Resource r) {
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
		MyThread2 t1=new MyThread2(r1);
		MyThread2 t2=new MyThread2(r1);
		Thread s1=new Thread(t1);
		Thread s2=new Thread(t2);
		s1.start();
		s2.start();
	}
}
