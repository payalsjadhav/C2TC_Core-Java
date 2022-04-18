package Day13;

class X {
	public void m1() {
		System.out.println("Hello");
	}
}
class Y extends X{
	public void m2() {
		System.out.println("Good Morning");
	}
}

public class z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X();
		Y y = new Y();
		X x1 = new Y();//y is sub clss of x
		Y y1 = new Y();

	}

}
