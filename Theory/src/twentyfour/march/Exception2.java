package twentyfour.march;

public class Exception2 {
	public static void main(String[] args) {
		int d,a;
		try {
			d=0;
			a=5/d; //an exception was thrown. Control went directly to the catch block
			System.out.println("This will not be printed");
		}
		catch(Exception e){
			System.out.println("Handled");
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		}
		System.out.println("This will also be printed");

	}

}
