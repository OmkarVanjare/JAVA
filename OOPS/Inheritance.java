package OOPS;

class A{
	void showA(){
		System.out.println(" a class method");
	}
}

class B extends A{
	void showB() {
		System.out.println(" b class method");
	}
}

class C extends B{
	void showC() {
		System.out.println(" c class method");
	}
}
public class Inheritance  {
	
	// Inheritance is to inherit the property of parent to child
	// There are three types of inheritance 1. Single 2. Multilevel 3. Hierarchy 
	// Relation between classes are of two type i inheritance{is A} ii. Associativity{has a}	
	// Associativity is divided in two type i.Aggression (weak bond) ii. Composition (strong bond)
	public static void main(String[] args) {
		
		C i = new C();
		i.showA();
		i.showB();
		i.showC();

	}

}
