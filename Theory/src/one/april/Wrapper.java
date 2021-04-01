package one.april;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //Static memory allocation
		Integer b=new Integer(5);
		System.out.println(b.BYTES);
		System.out.println(Integer.max(a, b));
		
		String str1="UPES"; //Object //Immutable in the memory / constant
		String str2="UPES"; //Object //Hence it will point to the same memory location as str1
		String str3=new String("UPES"); //Object
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1==str2); //str1 and str2 are pointing to the same memory location
		System.out.println(str1==str2); //str3 has been created as a new object
	}

}
