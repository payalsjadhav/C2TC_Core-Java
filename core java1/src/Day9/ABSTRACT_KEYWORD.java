package Day9;

abstract class A
{
	static int a;
	final int b=10;
	private int c;
	
	public int getc()
	{
		return c;
	}
	public void setc(int c)
	{
		this.c=c;
	}
	void a1()
	{
		System.out.println("Hey...");
	}
	abstract void a2();	
	//abstract A();
	//abstract int b;
	//abstract final void M1();
	//abstract static void M1();
	//abstract private void M1();
	
}
class X extends A
{
	void a2()
	{
		System.out.println("Hello..");
	}
}

public class ABSTRACT_KEYWORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj =new X();
		obj.a1();
		obj.a2();
		obj.setc(20);
		System.out.println(obj.getc());

	}

}
