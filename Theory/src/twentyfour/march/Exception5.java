package twentyfour.march;
//Till now we have seen how to handle runtime exceptions 
//Now is the time to learn how do we handle CheckedExceptions which are compile time exceptions
//Solution-1
public class Exception5 {
	static void throwone() throws IllegalAccessException {
		System.out.println("Inside throw one.");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwone();
		} 
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
