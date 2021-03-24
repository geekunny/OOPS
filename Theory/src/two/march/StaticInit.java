package two.march;

public class StaticInit {
	static Integer a;
	static final Double pi=3.14; // final is used so that the variable value cannot be changed even by using class
	
	static //static init block is like a constructor to static field. Note: This block is not copied in the constructor.
	{
		if(2%2==0)
			a=2;
		else
			a=3;
	}
	
	public static void main(String args[]) {
		System.out.println(StaticInit.a);
		// StaticInit.pi=1.23; // This will be an error. Value can not be changes if the variable is final 
		System.out.println(StaticInit.pi);
	}
}
