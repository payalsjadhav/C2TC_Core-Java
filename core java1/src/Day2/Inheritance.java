package Day2;

class College
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
class Depart extends College
{
	public void m3()
	{
		System.out.println("good night");
	}
}

public class Inheritance {

	public static void main(String[] args) {
	
		College cg = new College();
		Depart dp = new Depart();
		
		cg.m1();
		cg.m2();
		dp.m3();
	
	}

}
