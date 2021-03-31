package sixteen.march.NetflixCore;

public class Netflix implements NetflixAllAccess{

	@Override
	public void indiaContent() {
		// TODO Auto-generated method stub
		System.out.println("Hey, Indian content is streaming");
	}

	@Override
	public void ukContent() {
		// TODO Auto-generated method stub
		System.out.println("Hey, UK content is streaming");
	}
	
	@Override
	public void europeContent() {
		// TODO Auto-generated method stub
		System.out.println("Hey, Europe content is streaming");
	}

	@Override
	public void billing() {
		// TODO Auto-generated method stub
		System.out.println("You have been charged x $");
	}

	@Override
	public void fun() { // fun is the function which is present in all the three interfaces, but we haven't defined the
						// the body of the function so the body will be defined within the class only once. So this 
						// avoid the ambiguity of the same function which can not be achieved in the classes.
						// Therefore, multiple inheritance is not supported in classes but supported in interfaces as
						// atlast only single body will be defined no matter how many same functions you have written
						// in interfaces.
		
	}



}
