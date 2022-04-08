package Day13;

public class InheritancePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AA a1 = new AA(); 
		 BB b = new BB(); 
		 a1 = b; 

		  System.out.println("Value of x: " +a1.x); 
		  System.out.println("Value of y: " +a1.y); 

		// System.out.println("Value of z: " +a.z); // Error because z does not exist in class AA. 
		    a1.msg1(); 
		    a1.msg2(); 
		 // a1.msg3(); // Error msg3 of class

	}

}
