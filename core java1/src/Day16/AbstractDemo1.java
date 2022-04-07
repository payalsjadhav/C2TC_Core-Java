package Day16;

abstract class Demo
{
	abstract void myMethod1();
	void myMethod2()
	{System.out.println("Everyone");
	
	}
	abstract void myMethod3();
}
class Ex extends Demo
{
	void myMethod1()
	{
		System.out.println("Hello");
	}
	void method3()
	{
		System.out.println("My name is Payal");
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex obj=new Ex();
		obj.myMethod1();
		obj.myMethod2();
		obj.myMethod3();
		}

}
