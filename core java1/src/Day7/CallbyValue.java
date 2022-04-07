package Day7;

public class CallbyValue 
{
	 int change(int b) 
	  { 
	    ++b; // Changes will be in the local variable only. 
	    return b; 
	  } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of class. 
	    CallbyValue obj = new CallbyValue(); 
	     int a = 10; 
	     int x = obj.change(a); 
	     System.out.println("Value of a after passing: " +a); 
	     System.out.println("Value of x after modifying: " +x); 

	}

}
