package com.r177219086.q2;

import java.util.*;

public class HMTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Ram");
		map.put(2,"Sita");
		map.put(3,"Laxman");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the key you want to access: ");
		int k=input.nextInt();
		if(map.containsKey(k)) 
			System.out.println(map.get(k));
		else
			System.out.println("Key doesn't exist.");
		System.out.print("Enter the value you want to access: ");
		String v=input.next();
		if(map.containsValue(v))
			System.out.println("Value is accessed.");
		else
			System.out.println("Valaue doesn't exist");
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
