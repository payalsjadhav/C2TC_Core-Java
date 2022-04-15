package Day38;
public void stop() {
	system.out.println("");
	return ;
@Override
public void start() {
	System.out.println("I am in start method of Maruti Car");
}
public Maruti getCar1() {
	System.out.println("I want car object");
	return m;
	
}
}
class Duster extends Car{
	Duster Duster;
	public Duster getCar() {
		System.out.println(I am Duster);
		return m;
	}
}

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Maruti m = new Maruti();
		Car c = new Maruti(); //upcasting
		Maruti m = (Maruti)c; //downcasting
		m.getCar1();
		Car x = new Duster();
		c.start();//maruti car
		c.start();//car
		

	}

}
