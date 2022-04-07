package Day9;

class A
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
class MultipleInheritanceEXextends A,B 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultipleInheritanceEX obj=new
				MultipleInheritanceEX();
		obj.msg();

	}
}


