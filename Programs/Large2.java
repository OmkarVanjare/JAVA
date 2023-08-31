package Programs;
import java.util.*;
public class Large2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two Numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			System.out.println(a+ " is greater");
		}
		else {
			System.out.println(b+ " is greater");
		}
	}

}
