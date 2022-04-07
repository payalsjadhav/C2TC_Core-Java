package Day2;

class collage
{
	public void m1()
	{
		System.out.println("Hello ");
	}
	public void m2()
	{
		System.out.println("hi... ");
	}

}
class depart extends collage
{
	public void m3()
	{
		System.out.println("good night");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collage A,B;
		depart c;
		A= new collage();
		c= new depart();
		//A.m1();
		//c.m2();
		c.m1();
		c.m3();
		c.m2();

	}

}
