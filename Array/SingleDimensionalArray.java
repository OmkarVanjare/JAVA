package Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		System.out.println("Method 1");
		int array[] = new int[3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		System.out.println(array[0]);//by calling the index value
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println("Method 2");
		int array1[]= {4,5,6};
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);//For Loop
		}
		System.out.println("Method 3");
		int array2[]= new int[] {7,8,9};
		for(int i:array2) {
			System.out.println(i);//For Each Loop
		}
		
		

	}

}
