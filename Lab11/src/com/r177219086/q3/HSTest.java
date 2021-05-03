package com.r177219086.q3;
import java.util.*;
public class HSTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Sita");
		list.add("Laxman");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			set.add(it.next());
		}
		it=set.iterator();
		System.out.println("Before: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		set.removeAll(set);
		System.out.println("After: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		HashSet<Employee> setnew=new HashSet<Employee>();
		Employee e1=new Employee(1,"Ram");
		Employee e2=new Employee(2,"Sita");
		Employee e3=new Employee(3,"Laxman");
		setnew.add(e1);
		setnew.add(e2);
		setnew.add(e3);
		Employee e4=new Employee(2,"Sita");
		System.out.println("Does setnew contains e4? "+setnew.contains(e4));
	}

}
