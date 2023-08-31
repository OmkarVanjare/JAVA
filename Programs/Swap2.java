package Programs;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Numbers Before Swaping:- A: "+a+" B: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers After Swaping:- A: "+a+" B: "+b);
	}

}
