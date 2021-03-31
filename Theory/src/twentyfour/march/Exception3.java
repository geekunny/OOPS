package twentyfour.march;

//Hierarchy-> Object <- Throwable (Interface) <- Exception <- RuntimeException <- ArithmeticException/ArrayIndexOutOfBounds
// Object <- Throwable (Interface) <- Exception <- CheckedException <- FileNotFoundException
public class Exception3 {
	public static void main(String[] args) {
		int a,b;
		try {
			a=args.length; //a=0, for another exception change it to a=1
			System.out.println("a = "+a);
			b=5/a; //an arithmetic exception was thrown.
			System.out.println("b = "+b);
			int c[]= {1};
			c[40]=100; //ArrayIndexOutOfBounds was thrown
		}
		catch(ArithmeticException e){
			System.out.println("Handled");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled again");
			System.out.println(e);
		}
	}
}
