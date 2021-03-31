package ten.march;

public class MethodHiding extends Parent {
	public static void fun() { //This is not method overriding, this is method hiding in which child class hide the parent function of same name 
		// TODO Auto-generated method stub
		System.out.println("I am function of child.");
	}
}
