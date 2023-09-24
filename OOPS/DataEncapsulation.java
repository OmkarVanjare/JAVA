package OOPS;
class Employee1{
	private int EmpId;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
}
public class DataEncapsulation {

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.setEmpId(101);
		System.out.println("The employee ID is "+e.getEmpId());

	}

}
