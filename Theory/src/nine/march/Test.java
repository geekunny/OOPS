package nine.march;

public class Test {
	public static void main(String[] args) {
		AccessSpecifiers obj=new AccessSpecifiers();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		Protected obj1=new Protected();
		System.out.println("\n"+obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
	}
}
