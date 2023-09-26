package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(null);
		a1.add("Deepak");
		System.out.println(a1.contains("omkar"));
//		Iterator itr = a1.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		ArrayList a2 = new ArrayList();
//		a2.add(80);
//		a2.add(90);
//		a2.add(100);
//		a2.addAll(a1);
//		a1.addAll(a2);
//		System.out.println(a2);
		
//		a1.remove(2);
//		System.out.println(a1);
		

	}

}
