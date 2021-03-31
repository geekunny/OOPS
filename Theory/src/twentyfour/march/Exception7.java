package twentyfour.march;

import javax.management.RuntimeErrorException;

public class Exception7 {
	static void procA() {
		try {
			System.out.println("Inside Procedure A");
			throw new RuntimeException();
		}
		finally {
			System.out.println("Final Procedure A");
		}
	}
	static void procB() {
		try {
			System.out.println("Inside Procedure B");
			return; //Even returning from here won't stop finally block to excecute.
		}
		finally {
			System.out.println("Final Procedure B");
		}
	}
	static void procC() {
		try {
			System.out.println("Inside Procedure C");
		}
		finally {
			System.out.println("Final Procedure C");
		}
	}
	static void procD() {
		try {
			System.out.println("Inside Procedure C");
			System.exit(0);
		}
		finally {
			System.out.println("Final Procedure C, *Now, this will not be excecuted*");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			procA();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		procB();
		procC();
	}

}
