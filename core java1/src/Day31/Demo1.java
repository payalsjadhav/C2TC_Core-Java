package Day31;

public class Demo1 implements Demo12 
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}


}
interface A
{
	public default void m1()
	{
		System.out.println("Hello");
	}
}
interface B extends A
{
	public default void m1()
	{
		System.out.println("Hi.....");
	}
}
interface C extends A
{
	public default void m1()
	{
		System.out.println("Good Night....");
	}
}
interface D extends B,C
{
	public default void m1()
	{
		B.super.m1();
	}
}

