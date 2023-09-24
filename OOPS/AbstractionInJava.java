package OOPS;
abstract class Vehicle{
	abstract void start();
	
}
class Car extends Vehicle{
	void start() {
		System.out.println("Starts with a key");
	}
}
public class AbstractionInJava  extends Vehicle{
	@Override
	//Scooter
	void start() {
		System.out.println("Starts with kick");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		AbstractionInJava s = new AbstractionInJava();
		s.start();
	}
	/*
	 * This is a example of Abstraction in java
	 * A method without body(without implementation) is known as abstract method.
	 * A method must be always declared in an abstract class, or we can say that if an class has an abstract method it should be 
	   declared with abstract as well.
	 * If a regular class extends an abstract class,then the class must have to implement all the abstract methods of of abstract 
	   parent class or it has to be declared abstract as well.
	 * Abstract class cannot be initiated, means we cannot create object of abstract class.
	 */

}
