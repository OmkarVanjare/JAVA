package OOPS;

public class StaticMethod {
	 static void display() {
		System.out.println("1");
	}
	 static {
		 System.out.println("I am in static block");
	 }

	public static void main(String[] args) {
		display();
		XYZ.show();
	}

}
class XYZ{
	static void show() {
		System.out.println("2");
	}
}
//public class StaticMethod1 {
//	static void display() {
//		show();
//		System.out.println("1");
//	}
//	static void show() {
//		System.out.println("2");
//	}
//	public static void main(String[] args) {
//		display();
//	}
//
//}

/*
 * Rules for static method
 * "static" methods belongs to the class, not to the object.
 * A "static" method can be accessed directly by class name and doesnt need any object.
 * A "static" method can access only static data. It cannot access non-static data(instance data).
 * A "static" method can call only other static methods and cannot call a non-static method.
 * A "static" method cannot refer to "this" or "super" keyword in anyway.
 */

