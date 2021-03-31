package twentyfour.march;

public class Exception1 {

	public static void main(String[] args) {
		int d=0;
		try {
			int e=5/d;
		}
		catch(Exception e){
			System.out.println("Handled");
		}
		System.out.println("This will also be printed");

	}

}
