package seventeen.feb;
//Meaningfull toString
public class MeanigfullTostring {
	Integer a,b;
	MeanigfullTostring(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Object Created");
	}
	@Override
	public String toString() {
		return "a="+this.a+" b="+this.b;
	}
	public static void main(String args[]) {
		MeanigfullTostring obj1=new MeanigfullTostring(10,20);
		System.out.println(obj1); //obj1 = obj.toString()
		System.out.println(obj1.toString());
		MeanigfullTostring obj2=new MeanigfullTostring(30,40);
		System.out.println(obj2);
	}
}
