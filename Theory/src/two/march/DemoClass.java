package two.march;

public class DemoClass {
	Integer a,b;
	//Initializer block (Init Block)- Java will do nothing but copy this whole block to the first line in the default constructor
	{
		System.out.println("I have called first. I am at the first line of the constructor");
		if(2%2==0) {
			a=2;
			b=2;
		}
		else {
			a=3;
			b=3;
		}
	}

	public DemoClass() {
		// TODO Auto-generated constructor stub
		System.out.println("I have called later in the constructor");
	}
	public static void main(String args[]) {
		DemoClass obj=new DemoClass();
		System.out.println(obj.a+obj.b);
	}
}
