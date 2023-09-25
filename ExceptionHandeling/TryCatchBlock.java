package ExceptionHandeling;

import java.io.FileInputStream;

public class TryCatchBlock {

	public static void main(String[] args) {
		try {
//			FileInputStream fis = new FileInputStream("d:/abc.txt");
//			Class.forName("com.mysql.jdbc.Driver");
			int a=100,b=0,c;
			c=a/b;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello");

	}

}
