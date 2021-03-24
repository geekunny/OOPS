package seventeen.july;

public class PassByRef {
	int a;
	void fun(PassByRef obj) {
		a=obj.a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByRef obj1=new PassByRef();
		PassByRef obj2=new PassByRef();
		obj1.a=10;
		obj2.a=20;
		System.out.println("Obj1.a: "+obj1.a);
		System.out.println("Obj2.a: "+obj2.a);
		obj1.fun(obj2);
		System.out.println("\nObj1.a: "+obj1.a);
		System.out.println("Obj2.a: "+obj2.a);
	}

}
