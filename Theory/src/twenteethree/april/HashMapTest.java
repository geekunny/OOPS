package twenteethree.april;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(1,"Ram");
		map.put(2,"Lamxman");
		map.put(3,"Sita");
		map.put(3,"A");
		map.put(3,"B"); //Value at key-3 will be overridden
		map.put(null,"C"); 
		map.put(null,"D"); //Value at key-null will be overridden. Only one null value is permitted
		
		Employee e1=new Employee(5,"Hanuman");
		map.put(10,e1);
		
		System.out.println(map.keySet());
		
		Set temp=map.keySet();
		
		for(Object t:temp) {
			System.out.println(map.get(t));
		}
		
	}

}
