package assignment.three;

public class MyThread3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r1=new Resource();
		MyThread3 t1=new MyThread3();
		MyThread3 t2=new MyThread3();
		Runnable ru=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					r1.myWork();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread s1=new Thread(ru);
		Thread s2=new Thread(ru);
		s1.start();
		s2.start();
	}

}
