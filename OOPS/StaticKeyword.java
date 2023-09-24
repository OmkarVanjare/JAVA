package OOPS;
class School{
	int id;
	String name;
	static String company="St Annes Convent School";
	public School(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id+" "+name+" "+company);
	}
}
class counetrDemo{
	static int count =0;
	public counetrDemo() {
		count++;
		System.out.println(count);
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		
		School obj = new School(101,"Omkar");
		obj.display();
		counetrDemo c = new counetrDemo();
		counetrDemo c2 = new counetrDemo();
		counetrDemo c3 = new counetrDemo();
		
		
		

	}

}
