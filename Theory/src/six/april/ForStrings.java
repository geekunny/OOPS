package six.april;

import java.util.StringTokenizer;

public class ForStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------------------------String--------------------------------
		char ch[]= {'h','e','l','l','o'};
		System.out.println("Char array: "+ch); //hashcode
		String str=new String(ch);
		System.out.println("String using new: "+str);
		
		System.out.println("Check using equals: "+str.equals(ch));
		String s1="Example of being immutable";
		String s2="Example of being immutable";
		System.out.println("s1==s2: "+(s1==s2));
		String s3=new String("Example of being immutable");
		System.out.println("s1==s3: "+(s1==s3)); //Address check
		System.out.println("s1 equals s3: "+(s1.equals(s3))); //Content check
		System.out.println("s1 compare to s2: "+(s1.compareTo(s2)));
		System.out.println("s1 compare to s3: "+(s1.compareTo(s3)));
		s3.intern(); //returned address is not stored anywhere, use s3=s3.intern();
		System.out.println("s1==s3: "+(s1==s3)); //return false because the returned address is not stored anywehere, use s3=s3.intern();
		
		String s41="abc";
		String s51="abc";
		String s61="abcdef";
		System.out.println("s41==s51: "+(s41==s51));
		String s71=new String("abc");
		s71=s71+"def";
		System.out.println(s61);
		System.out.println(s71);
		System.out.println("s61==s71: "+(s61==s71));
		s71=s71.intern();
		System.out.println("s61==s71: "+(s61==s71));
		s51.concat("def"); //will not work, since its immutable
		System.out.println(s51);
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.format("Hey there %d and %d results in %d",2,3,5));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(4,9));
		System.out.println(s1.substring(0,1));
		System.out.println(s1.contains("bein"));
		System.out.println(s1.isEmpty());
		
		String s4="Hi this is";
		String s5="AIML from UPES";
		//Calling toString makes mutable string to immutable 
		String s6=s4+s5; //+ will act like this, String s6=(new StringBuilder()).append(s4).append(s5).toString();
		System.out.println(s6);
		s4.concat(s5); //will not work as String is immutable 
		System.out.println(s4);
		s4=s4.concat(s5); // A new string willl be created and s4 will be pointing to that string
		System.out.println(s4);
		
		s1.replace('o', 'q');// Will not work as it is immutable
		System.out.println(s1);
		s1=s1.replace("being", "not");
		System.out.println(s1);
		String s7="     after 5 spaces";
		System.out.println(s7);
		System.out.println(s7.trim());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.startsWith("Exa"));
		System.out.println(s1.endsWith("able"));
		
		int a=20;
		String s8=String.valueOf(a);
		System.out.println(s8+12);
		
		//----------------------------------String Buffer------------------------
		StringBuffer sf1=new StringBuffer(); //It is syncronised
		System.out.println(sf1.capacity() +" "+ sf1); //Empty string still has a capacity of 16
		sf1.append("few string to append");
		System.out.println(sf1 + " "+ sf1.capacity()); //Formula new capacity = old*2 +2
		sf1.insert(0,"See more appended ");
		System.out.println(sf1+" "+sf1.capacity());
		sf1.replace(0, 17, "deleted");
		System.out.println(sf1+" "+sf1.capacity());
		sf1.delete(0,5);
		System.out.println(sf1+" "+sf1.capacity());
		sf1.reverse();
		System.out.println(sf1+" "+sf1.capacity());
		
		StringBuilder sb1=new StringBuilder(); // It is not syncronised
		System.out.println(sb1+" "+sb1.capacity());
		sb1.append("few string to append");
		System.out.println(sb1 + " "+ sb1.capacity()); //Formula new capacity = old*2 +2
		sb1.insert(0,"See more appended ");
		System.out.println(sb1+" "+sb1.capacity());
		sb1.replace(0, 17, "deleted");
		System.out.println(sb1+" "+sb1.capacity());
		sb1.delete(0,5);
		System.out.println(sb1+" "+sb1.capacity());
		sb1.reverse();
		System.out.println(sb1+" "+sb1.capacity());
		
		String s9="This string , will be , tokenized";
		StringTokenizer stk=new StringTokenizer(s9,"s");
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		 String s10[] =s9.split(",");
		 System.out.println(s10.length);
		 System.out.println(s10[0]+ "XX" +s10[1] + "XX"+ s10[2]);
		 
	}

}
