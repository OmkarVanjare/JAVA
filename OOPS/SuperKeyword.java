package OOPS;

class AA{
//	int i=10;
	AA(){
		System.out.println("I am AA class Constructor");
	}
	void m1() {
		System.out.println("I am in class A");
	}
}

public class SuperKeyword extends AA{
//	int i=20;
//	void show(int i) {
//		System.out.println(super.i);
//	}
//	void m1() {
//		System.out.println("I am in class B");
//	}
//	void show() {
//		m1();
//		super.m1();
//	}
	
	 SuperKeyword() {
		System.out.println("I am B class constructor");
	}

	public static void main(String[] args) {
		SuperKeyword obj = new SuperKeyword();
	/*
	 * Uses of Super KeyWord
	 * "super" keyword can be used to refer immediate parent class instance variable.
	 * "super" keyword can be used to invoke immediate parent class method.
	 * super() can be used to invoke immediate parent class constructor.
	 */

	}

}
