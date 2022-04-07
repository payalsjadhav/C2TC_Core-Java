package Day2;

class C1
{
	public void meth1()//overriding with class D method 1
	{
		System.out.println("Show Method 1 of class A");
	}
	public void meth2()
	{
		System.out.println("Show Method 2 of class A");
	}
}
class D1 extends C1
{
	public void meth1()//overriding with class c method 1
	{
		System.out.println("Show Method 1 of class B");
	}
	public void meth3()
	{
		System.out.println("Shoe method 3 of class B");
	}
}

public class OverridingDemo {
	
//		static void foo()
//		{
//			System.out.println("Payal Jadhav");
//		}
//		static void foo(int a)//overloading
//		{
//			System.out.println("Roll No. "+a);
//		}
//		static void foo(int a, int b)
//		{
//			System.out.println("Roll No. "+a);
//			System.out.println("Roll No. "+b);
//		}
		public static void main(String[] args) {
//			foo();
//			foo(21);
//			foo(22,23);
			
			C1 a;
			a= new C1();
			a.meth1();
			
			D1 b=new D1();
			b.meth1();

	}

}
