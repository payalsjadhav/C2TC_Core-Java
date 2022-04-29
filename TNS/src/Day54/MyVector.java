package Day54;

import Day53collectionFramework.collectionEmployee;

class vector1{
	
}

public class MyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyVector v1,v2;
		collectionEmployee e1 = new collectionEmployee(1,"Payal",10000);
		collectionEmployee e2 = new collectionEmployee(1,"Jadhav",10000);
		v1 = new MyVector ();
		v2 = v1;
		System.out.println(v1.equals(v2));//
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(e1.equals(e2));//
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
