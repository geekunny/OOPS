package ten.march;

public class MethodOveriding extends ParentTwo{
	public MethodOveriding() {
		// TODO Auto-generated constructor stub
		//super(); // Wheather you write it or not it is already there which says call the constructor of parent class.
		System.out.println("Object of child class is created");
	}
	@Override
	public void fun() {
		// TODO Auto-generated method stub
		super.fun(); //Super will call the same function from the parent of this class
		System.out.println("I am overriden in a child class.");
	}
	
}
