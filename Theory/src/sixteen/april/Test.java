package sixteen.april;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list= new ArrayList();    //List - Ordered, Duplicate, Unsorted
		String temp="Milk";
		list.add(temp); //0
		list.add("Bread"); //1
		list.add("Butter"); //2
		
		Employee e1=new Employee(1,"Ram"); 
		Employee e2=new Employee(2,"Laxman");
		Employee e3=new Employee(3,"Sita"); 		
		list.add(e1); //3
		list.add(e2); //4
		list.add(e3); //5
		
		Employee tempe=(Employee) list.get(4);
		
		if(list.get(4) instanceof Employee) {
			System.out.println(list.size());
		}
		else {
			String tempString=(String)list.get(0);
		}
		
		//For the heterogeneous data, we always have to check conditions like this
		//To overcome this, we use E while arraylist which we call generics in java
		//which allow object to accept the values of particular type and no other else.
		//ArrayList<Employee> list1=new ArrayList<Employee>(); //Generics
		//We can restrict our list to contain specefic type of items using generics.
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\nAfter: ");
		list.remove(1);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}	

}
