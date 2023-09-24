package OOPS;
class demo{
	 void A1() {
		System.out.println("A class Method");
	}
}

public class FinalKeyword extends demo{
	void A1() {
		System.out.println("B class method");
	}

	public static void main(String[] args) {
//		final int i =10;
//		i=i+20;
//		System.out.println(i);
		
		FinalKeyword obj = new FinalKeyword();
		obj.A1();

	}

}
