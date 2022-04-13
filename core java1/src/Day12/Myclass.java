package Day12;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle a=new Vehicle("Hero", 125, 80000, "pune");
		a.display();
		
		Bike b=new Bike("Bajaj", 150, 125000, "katraj", 5000);
		b.display();
		b.Discount();

	}

}
