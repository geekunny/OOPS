package sixteen.july;

import java.util.Scanner;

public class Ellipsis {
	void fun(int... a) {
		for(int i=0;i<a.length;i++) {
			System.out.println("a"+a[i]);
		}
		System.out.println();
	}
	void fun1(Object... a) { //If you want different multiple parameters to be passed ==> n no. of arguments and n type of arguments
		System.out.println(a.length);
	}
	void fun2(int a,int b,double... c) { //Only one ellipsis operator can be in a parameter and that too at the last
		System.out.println(c.length);
	}
	public static void main(String args[]) {   //String... args = String args[]
		Ellipsis obj=new Ellipsis();
		obj.fun(10);
		obj.fun(10,20);
		obj.fun(10,20,30);
		obj.fun(10,20,30,40);
		obj.fun1(new String(),new Scanner(System.in),new Thread());
		obj.fun2(10,20,30.1,40.31,50.32,60.2,70.4,80.8);
	}
}
