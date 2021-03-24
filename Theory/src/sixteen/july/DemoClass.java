package sixteen.july;

public class DemoClass {
	private DemoClass() {
		System.out.println("Hello from a private constructor");
	}
	static DemoClass obj=new DemoClass();
	static DemoClass getObject() {
		return obj;
	}
}
