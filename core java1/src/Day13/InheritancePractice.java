package Day13;

class AA
{
	int x = 10;
}
class BB extends AA
{
	int y = 5;
}
public class InheritancePractice 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AA a = new AA(); 
		 BB b = new BB(); 

		  System.out.println("Value of x: " +a.x); 
		  System.out.println("Value of y: " +b.y); 

	}

}
