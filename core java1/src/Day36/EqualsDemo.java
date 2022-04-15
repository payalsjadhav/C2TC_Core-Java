package Day36;
class Aa {
	
}
class Ab {
	int i;
	String s; //global variable
	static int j;
	public Ab() {
		
	}
	public Ab(int i,String s) {
	this.i = i;
	this.s = s;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i =i;
	}
	public String gets() {
		return s;
	}
	public void sets(String s) {
		this.s = s;
	}
}
public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a = new Aa(); //reference 1
		Aa a1 = a;
		Aa a2 = new Aa(); //Reference 2
		/*if(a==a1)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a == a2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a1))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");*/
		
		
		Ab b = new Ab(7,"Payal");
		Ab b1 = b;
		Ab b2 = new Ab(7,"Payal");
		
		if(a==a1)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a == a2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a1))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(a.equals(a2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");

	}

}
