package sixteen.march;

import java.util.Scanner;

//Implementing an interface will require unimplemented methods in an interface to be defined in the class
//We can implement more interfaces
public class SignIn implements Printable,Scanable {

	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void printBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye");
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(sc.next());
	}
	
}
