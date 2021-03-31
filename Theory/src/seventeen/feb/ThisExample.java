package seventeen.feb;

public class ThisExample {
	public ThisExample() {
		this(30,40); //will move to parameterized constructor
		System.out.println("I am default constructor with object instance id- "+this); //seventeen.july.ThisExample@Hashcode
	}
	Integer a,b;
	public ThisExample(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("I am parameterized constructor with object instance id- "+this);
	}
	Integer sum() {
		System.out.println("I am sum called by object instance id- "+this);
		return a+b;
	}
	public static void main(String[] args) {
		ThisExample obj1=new ThisExample();
		ThisExample obj2=new ThisExample(10,20);
		System.out.println("obj1 instance id- "+obj1); //sysout(obj1) = sysout(obj.tostring())
		System.out.println("obj2 instance id- "+obj2.toString());
		System.out.println("Sum: "+obj2.sum()); 
		System.out.println("Sum: "+obj1.sum()); //In java, all uninitialized values are initialized by 0
	}

}
