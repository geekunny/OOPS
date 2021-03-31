package three.march;

public class Outer {
	private int a=10;
	private static int b=20;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a="+a+" from outer";
	}
	public class Inner1 {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "This is a="+a+" b="+b+" from inner";
		}
	}
	public static class Inner2 {
		Outer obj=new Outer(); 
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "This is a="+obj.a+" b="+b+" from inner"; //Non static variable cannot be accessed directly in static field
		}
	}
}
