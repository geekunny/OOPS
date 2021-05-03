package twenteethree.april;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Ram");
		map.put(2,"Lamxman");
		map.put(3,"Sita");
		map.put(3,"A");
		map.put(3,"B"); //Value at key-3 will be overridden
//		map.put(null,"C"); We can not have null keys in TreeMap bcz for sorting we need some keys to be defined
		
		System.out.println(map.keySet());
		
		Set<Integer> temp=map.keySet();
		
		for(Integer t:temp) {
			System.out.println(map.get(t));
		}
		
		TreeMap<Employee,Employee> map1=new TreeMap<Employee,Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		Employee e1=new Employee(10,"Krishna");
		Employee e2=new Employee(11,"Radha");
		Employee e3=new Employee(12,"Sudhama");
		
		map1.put(e1, e1);
		map1.put(e2, e2);
		map1.put(e3, e3);
		
		Set<Employee> temp1=map1.keySet();
		
		for(Employee t1:temp1) {
			System.out.println(map1.get(t1));
		}
		
	}
}
