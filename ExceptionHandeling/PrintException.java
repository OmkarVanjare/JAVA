package ExceptionHandeling;

public class PrintException {

	public static void main(String[] args) {
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			//method1
			e.printStackTrace();
			//method2
			System.out.println(e);
			System.out.println(e.toString());
			//method3
			System.out.println(e.getMessage());
		}


	}

}
