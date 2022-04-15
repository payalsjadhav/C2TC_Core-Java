
package Day31;

public interface Demo12 
{
	void m1(); //Abstract method
	void m2(); //Abstract method
	void m3(); //Abstract method
	
	default void  m4() //Default Method
	{
		System.out.println(" Hello");
	}
}
