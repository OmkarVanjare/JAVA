package ExceptionHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadandWrite{
	void readfile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	void savefile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
		
	}
}
public class ThrowsKeyword {

	public static void main(String[] args) {
		
		ReadandWrite rw = new ReadandWrite();
		try {
			rw.readfile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			rw.savefile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
	}

}
