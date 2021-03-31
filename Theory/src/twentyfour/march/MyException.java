package twentyfour.march;
//This is the way to create your custom exceptions
public class MyException extends Exception{
	public MyException(String message) {
		// TODO Auto-generated constructor stub
		super(message); //this will call the constructor of the parent with some message
	}
}
