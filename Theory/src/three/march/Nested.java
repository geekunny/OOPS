package three.march;

public class Nested {

	public static void main(String[] args) {
		Outer obj1=new Outer();
		Outer.Inner1 obj2=obj1.new Inner1();
		Outer.Inner2 obj3=new Outer.Inner2();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
