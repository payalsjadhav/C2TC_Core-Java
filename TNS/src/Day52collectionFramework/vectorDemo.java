package Day52collectionFramework;

import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1 = new String("Payal");
		String s2 = new String("Payal");
		collectionEmployee e1 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e2 = new collectionEmployee(1,"Payal",10000);
		v1.add(s1);
		v2.add(e2);
		System.out.println(v1.contains(s2));
		System.out.println(v2.contains(e2));

	}

}
