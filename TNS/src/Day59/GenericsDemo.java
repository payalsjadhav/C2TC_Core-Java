package Day59;

import java.util.Vector;

import Day53collectionFramework.collectionEmployee;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v3 = new Vector();
		String s1 = new String("Payal");
		collectionEmployee e1 = new collectionEmployee(1,"Payal",10000);
		v3.add(s1);
		v3.add(e1);
		v3.add(3);
		System.out.println(v3);

	}

}
