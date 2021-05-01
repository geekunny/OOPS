package twenty.april;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>(); //HashSet - Unordered, Unique, Unsorted 
		set.add("A");
		set.add("B");
		set.add("B");
		set.add("B");
		set.add("B");
		set.add("C");
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Employee> set1=new HashSet<Employee>();
		Employee e1=new Employee(1,"Ram");
		Employee e2=new Employee(2,"Laxman");
		Employee e3=new Employee(3,"Sita");
		Employee e4=new Employee(1,"Ram");
		
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		set1.add(e4);
		it=set1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Employee> set2=new TreeSet<Employee>(); // TreeSet - Ordered, Unique, Sorted 
		set2.add(e1);
		set2.add(e2);
		set2.add(e3);
		set2.add(e4);
		it=set2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
