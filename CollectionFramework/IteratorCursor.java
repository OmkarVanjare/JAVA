package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(100);
		l.add(200);
		l.add("deepak");
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	

	}

}
