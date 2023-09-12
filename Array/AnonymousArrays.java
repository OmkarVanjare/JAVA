package Array;

public class AnonymousArrays {
	static void sum(int[] no) {
		int total=0;
		for(int i:no) {
			total= total+i;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		sum(new int[]{10,20,50});
		
		

	}

}
