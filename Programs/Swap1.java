package Programs;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c=0;
		System.out.println("Enter two numbers:- ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Numbers Before Swaping:- A: "+a+" B: "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers After Swaping:- A: "+a+" B: "+b);
		
		

	}

}
