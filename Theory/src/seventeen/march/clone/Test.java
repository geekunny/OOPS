package seventeen.march.clone;

public class Test{

	public static void main(String[] args) throws CloneNotSupportedException {
		Department d1=new Department(1, "HR");
		Employee e1=new Employee(1, "Hunny",d1);
		//One way to clone an object is copy constructor
		Employee e2=new Employee(e1);
		//Another way is to implement marker interface - Cloneable and directly call the clone function from Object class
//		Employee e3=(Employee)e1.clone(); Now we dont have to typecaste here, We have already done once in Employee class
		Employee e3=e1.clone(); //In the clone function, it is return an Object so we have to type cast 
		Employee e4=e2.clone(); // to Employee
		e1.setName("Bhav");					
		e2.setId(2);
		e3.setId(3);
		e3.setName("Rockstar");
		e2.getDep().setDid(2); //It will still refer to the same object and change the values of all employees. It is shallow copy.
		System.out.println(e1);//We haven't clone the department object. For this, make copy contructor for department also -> Deep copy.
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}

}
