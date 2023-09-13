package OOPS;
class employee{
	String name;
	int emp_ID;
	employee(String name, int emp_ID){
		this.name = name;
		this.emp_ID = emp_ID;
	}
}
public class Constructor {

	public static void main(String[] args) {
		// Constructors in JAVA
		// Constructor is a similar block have same name as that of class
		// Constructor does not have a return type
		// Only 4 modifiers are applicable 1.public 2.protected 3.default 4.private
		// Constructed is used to initialize an object and not to create an object
		// There are three type of constructors 
		//1. Default constructor which is created by compiler
		//2. No argument constructor created by programmer
		//3. Parameterized constructor (used in this example) created by programmer
		employee e1 = new employee("Omkar",101);
		employee e2 = new employee("Pratik",102);
		System.out.println("Employee name  and ID : "+e1.name+ " "+e1.emp_ID);
		System.out.println("Employee name  and ID : "+e2.name+ " "+e2.emp_ID);

	}

}
