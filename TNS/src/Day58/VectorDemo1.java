package Day58;

import java.util.HashSet;
import java.util.Vector;
import java.util.stream.Stream;

import Day53collectionFramework.collectionEmployee;

public class VectorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1 = new String("Payal");
		String s2 = new String("Payal");
		v1.add(s1);
		System.out.println(v1.contains(s2));//true
		
		collectionEmployee e1 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e2 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e3 = new collectionEmployee(1,"Rupa",10000);
		collectionEmployee e4 = new collectionEmployee(1,"Shubro",10000);
		collectionEmployee e5 = new collectionEmployee(1,"Vikas",10000);
		collectionEmployee e6 = new collectionEmployee(1,"Avijit",10000);
		collectionEmployee e7 = new collectionEmployee(1,"Diya",10000);
		collectionEmployee e8 = new collectionEmployee(1,"Avantika",10000);
		collectionEmployee e9 = new collectionEmployee(1,"Shivani",10000);
		v1.add(s1);
		v2.add(e1);
		v1.add(e3);
		v2.add(e4);
		v1.add(e5);
		v2.add(e6);
		v1.add(e7);
		v2.add(e8);
		System.out.println(v2);
		v2.remove(e2);
		System.out.println(v2);
		System.out.println(v2.contains(e2));
		//Construct Stream
		Stream.Builder<collectionEmployee> streamemp = Stream.builder();
		streamemp.accept(e3);
		streamemp.accept(e4);
		streamemp.accept(e5);
		streamemp.accept(e6);
		
		Stream <collectionEmployee> empStream = streamemp.build();
		System.out.println(empStream);
		
		Stream <collectionEmployee> empStreamOf = Stream.of(e5,e7,e8);
		System.out.println(empStreamOf);
	}
}
		

