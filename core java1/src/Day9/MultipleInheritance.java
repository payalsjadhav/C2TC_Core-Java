package Day9;

class A1
{
	void msg()
	{
		System.out.println("Hello");
	}
}
class B
{
	void msg()
	{
		System.out.println("Welcome");
	}
}
public class MultipleInheritance extends A1, B
{
	public static void main(String[] args) 
	{
		MultipleInheritance obj=new MultipleInheritance();
		
		obj.msg();
	}
}


