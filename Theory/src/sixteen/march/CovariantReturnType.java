package sixteen.march;
//
//Inheritance ===> Object <- CovariantReturnType <- Child
//Covariance of Object class is CovariantReturnType and Child
//Covariant of CovariantReturnType class is child
//There is not covariance of Child class
//Covariance of any class is all its child classes
//Signature of any same function can not be different in parent and child class unless return type is the covariance classes

public class CovariantReturnType{
	Object fun() {
		return hashCode();
	}
}
