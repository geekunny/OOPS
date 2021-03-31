package twentyfour.march;

public class Exception4 {
	static void nesttry(int a) {
		try {
			if (a == 1)
				a = a / (a - a); // Throws an ArithmeticException
			if (a == 2) {
				int c[] = { 1 };
				c[23] = 34; // Throws an ArrayIndexOutOfBoundsException
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		try {
			int a=1; //try by changing the values of a =0/1/2
			int b=3/a;
			System.out.println("a = "+a);
			nesttry(a); //Exception Propogation
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}

}
