package Array;

public class JaggedArray {

	public static void main(String[] args) {
		int Array [][]= new int[2][];
		Array[0]=new int[3];
		Array[1]=new int[2];
		
		Array[0][0]=1;
		Array[0][1]=2;
		Array[0][2]=3;
		Array[1][0]=4;
		Array[1][1]=5;
		
		
		System.out.print(Array[0][0]);
		System.out.print(Array[0][1]);
		System.out.println(Array[0][2]);
		System.out.print(Array[1][0]);
		System.out.print(Array[1][1]);
		
		

	}

}
