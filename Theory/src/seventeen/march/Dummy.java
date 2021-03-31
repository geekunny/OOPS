package seventeen.march;

public class Dummy implements Faculty,Student{
	
	void fun() {
		System.out.println("Hello");
	}
	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("Learning");
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("Teaching");
	}

}
