package Day59;


import java.util.TreeSet;

import Day53collectionFramework.collectionEmployee;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1 = new TreeSet();
		collectionEmployee e1 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e2 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e3 = new collectionEmployee(1,"Rupa",10000);
		collectionEmployee e4 = new collectionEmployee(1,"Shubro",10000);
		collectionEmployee e5 = new collectionEmployee(1,"Vikas",10000);
		collectionEmployee e6 = new collectionEmployee(1,"Avijit",10000);
		collectionEmployee e7 = new collectionEmployee(1,"Diya",10000);
		collectionEmployee e8 = new collectionEmployee(1,"Avantika",10000);
		collectionEmployee e9 = new collectionEmployee(1,"Shivani",10000);
		t1.add(e9);
		t1.add(e6);
		t1.add(e3);
		t1.add(e2);
		t1.add(e1);
		t1.add(e8);
		System.out.println(t1);

	}

}
