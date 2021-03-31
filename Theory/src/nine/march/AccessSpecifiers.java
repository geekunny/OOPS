package nine.march;

public class AccessSpecifiers {
	public int a=1; //Access to all the classes in any packages
	int b=2; // = default int b=2; //Package private, access to all the classes within same package
	protected int c=3; //Access to child classes inheriting from the parent class as well as classes within same package
	private int d=4; //Access  only to class members
	
	public static void main(String[] args) {
		AccessSpecifiers obj=new AccessSpecifiers();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
