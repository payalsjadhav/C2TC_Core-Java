package Day15;

import Day15.C1;

class C1
{
	public int a=20;
	protected int b=30;
	int c=40;
	private int d=50;
	public void M1()//we can use and access all modifiers in same class...
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
	
}
class C2 extends C1// we can use access modifier in sub class except private modifier... 
{
	public void M2()
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	//System.out.println(d);
	}
}

public class Access_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj;
		obj = new C1();
		//obj.M1();// All access modifier can allows this object creation...
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		//System.out.println(obj.d);//we can't access private modifier from different class and same package... 


	}

}
