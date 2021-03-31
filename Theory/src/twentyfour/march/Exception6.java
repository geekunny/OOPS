package twentyfour.march;
//Solution-2
public class Exception6 {
	static void throwone() throws IllegalAccessException {
		System.out.println("Inside throw one.");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		throwone();
	}

}
