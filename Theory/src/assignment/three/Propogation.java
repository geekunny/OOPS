package assignment.three;

public class Propogation {
	private void method1() {
		method2();
	}
	private void method2() {
		try {
			method3();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception is propogated from method4 to method2 and handled by method2");
		}
	}
	private void method3() {
		method4();
	}
	private void method4() {
		int a=20;
		try {
			System.out.println(a/0);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Propogation obj=new Propogation();
		try {
			obj.method1();
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}