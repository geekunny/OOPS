package seventeen.march;

public class Test implements Cloneable{
	//Another inbulit marker interface is Cloneable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dummy obj=new Dummy();
		obj.fun();
		if(obj instanceof UPES) { //This may be the use of marker interface
			obj.learn();
			obj.teach();
		}
		
	}

}
