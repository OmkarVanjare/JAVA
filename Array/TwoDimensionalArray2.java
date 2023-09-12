package Array;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
	int Array[][]= {{10,20,30,40},{50,60},{70,80,90}};
	for(int i=0;i<Array.length;i++) {
		for(int j=0;j<Array[i].length;j++) {
			System.out.print(Array[i][j]+" ");
		}
		System.out.println();
	}

	}

}
