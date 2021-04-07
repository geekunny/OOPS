package six.april;

public class StringsStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello"; //Stored in SCP (String Constant Pool) //Address - 1001
		str1=str1+"World"; //Create another object in heap // 2001
		String str2="HelloWorld"; //Stored in SCP - 3001
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2); //2001 != 3001
		
		String str3="Hello"; // Will look for the reference in SCP // Address - 1001
		str1=(str3+"World").intern(); //Will look for the reference in SCP // Address - 3001
		System.out.println(str1==str2);
	}

}
