package Day38;

abstract class Car {
	Car car;
	public void start() {
		System.out.println("Started");
	}
	public Car getId() {
		return car;
	}
	public void stop() {
		System.out.println("Stoped");
	}
}
class Maruti extends Car {
	
}
class Creta{
	
}
class Duster{
	
}
class Jazz{
	
}
class BMW{
	
}

public class TypeCast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.
		Maruti m = (Maruti)c;

	}

}
