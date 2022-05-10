package Day60;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> hset = new LinkedHashSet<Object>();
		hset.add(5);
		hset.add("xyz");
		hset.add(15);
		hset.add(89);
		hset.add(null);
		hset.add(null);
		Iterator<Object> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		}

}
