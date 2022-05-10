package Day53collectionFramework;

import java.util.HashSet;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1 = new String("Payal");
		String s2 = new String("Payal");
		collectionEmployee e1 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e2 = new collectionEmployee(1,"Jadhav",10000);
		/*collectionEmployee e3 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e4 = new collectionEmployee(1,"Jadhav",10000);
		collectionEmployee e5 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e6 = new collectionEmployee(1,"Jadhav",10000);
		collectionEmployee e7 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e8 = new collectionEmployee(1,"Jadhav",10000);
		collectionEmployee e9 = new collectionEmployee(1,"Payal",10000);*/
		v1.add(s1);
		v2.add(e1);
		/*v1.add(e3);
		v2.add(e4);
		v1.add(e5);
		v2.add(e6);
		v1.add(e7);
		v2.add(e8);*/
		System.out.println(v1.contains(s2));//
		System.out.println(v2.contains(e2));//*/
		/*collectionEmployee e1 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e2 = new collectionEmployee(1,"Jadhav",10000);*/
		
		HashSet hs1 = new HashSet();
		hs1.add(e1);
		System.out.println(hs1.contains(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		

	}

}



/*hashcode
MyVector
class MyVector implements Collection{
	MyVector mv = new MyVector();
	mv.ad("A");
	mv.add("AB");
	mv.add("ABC");
	mv.add("BD");
}*/