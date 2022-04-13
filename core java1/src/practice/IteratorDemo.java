package practice;

import java.util.Collection;
import java.util.List;

public class IteratorDemo {
	void Display(List<String> list) {
		Iterator<String> oj = list.listIterator();
		while(oj.hasNext()) {
			System.out.println("Element is:"+ oj.next());
		}
	}

	public void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> oj = new LinkedList<>();
		oj.add("Payal");
		oj.add("ABC");
		oj.add("XYZ");
		oj.add("PQR");
		oj.add("DEF");
		System.out.println("Element is:"+oj);
		
		IteratorDemo id = new IteratorDemo();
		
		oj.sort(null);
		id.Display(oj);
		System.out.println("####################");
		Collections.reverse(oj);
		id.Display(oj);

	}
}

