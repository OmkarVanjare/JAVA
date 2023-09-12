package Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int Array1[][]=new int[3][3];
		Array1[0][0]=1;
		Array1[0][1]=2;
		Array1[0][2]=3;
		Array1[1][0]=4;
		Array1[1][1]=5;
		Array1[1][2]=6;
		Array1[2][0]=7;
		Array1[2][1]=8;
		Array1[2][2]=9;
		
		//Two dimensional array is also known as matrix array
		for(int i=0;i<Array1.length;i++) {
			for(int j=0;j<Array1.length;j++) {
				System.out.print(Array1[i][j]);
			}
			System.out.println();
		}

	}

}
