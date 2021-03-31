package seventeen.march.clone;

public class Department implements Cloneable{
	int did;
	String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Department ID- "+did+" Department Name- "+dname;
	}
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public Department(Department dep) {
		// TODO Auto-generated constructor stub
		this.did=dep.did;
		this.dname=dep.dname;
	}
	@Override
	protected Department clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Department)super.clone();
	}
}
