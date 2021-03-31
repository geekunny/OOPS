package ten.march;

public class Test {
	public static void main(String[] args) {
		Parent.fun();
		MethodHiding.fun();
		
		ParentTwo obj1=new ParentTwo();
		MethodOveriding obj2=new MethodOveriding();
		obj1.fun();
		obj2.fun();
	}
}
