package OOPS;
interface I1{
	void show();
}
interface I2{
	void display();
}
public class InterfaceInJava implements I1,I2{
	public void show() {
		
		System.out.println("1");
	}
	public void display() {
		System.out.println("2");
	}

	public static void main(String[] args) {
		InterfaceInJava i = new InterfaceInJava();
		i.show();
		i.display();

	}
	/*
	 * 1. What is interface?
	 * Interface is a mechanism to achieve abstraction in java.
	 * Interface is similar to abstract class but having all the methods of abstract type
	   i.e it cannot have a method body.
	 * Since Java 8, we can have default and static methods in an interface.
	 * Since Java 9, we can have private methods in an interface.
	 * 2. why use Java interface?
	 * It is used to achieve abstraction.
	 * By interface we can support the functionality of multiple inheritance.
	 * It can be used to achieve loose coupling.
	 */

}
