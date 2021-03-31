package seventeen.march.clone;

public class Employee implements Cloneable{
	private int id;
	private String name;
	Department dep;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name,Department dep) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
	}
	public Employee(Employee e1) {
		// TODO Auto-generated constructor stub
		this.id=e1.id;
		this.name=e1.name;
		this.dep=new Department(e1.getDep());//again we have to make a copy constructor for creating a copy of the department object
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee ID- "+id+" Employee Name- "+name+dep;
	}
	public Department getDep() {
		return dep;
	}
	public void setDep(Department dep) {
		this.dep = dep;
	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {   //We want employee object to returned
//		// TODO Auto-generated method stub						   //and super.clone is returning Object, Therefore	
//		return super.clone();									   //Typecast (Employee)super.clone and Employee clone()	
//	}		  
	@Override
	protected Employee clone() throws CloneNotSupportedException {  
		// TODO Auto-generated method stub		
		Employee temp=(Employee)super.clone();
		temp.setDep(temp.getDep().clone());
		return temp;									  
	}
}
