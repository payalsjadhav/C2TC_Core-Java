
package Day31;

public interface Demo12 
{
	void m1();
	void m2();
	void m3();
	
	default void  m4()
	{
		System.out.println(" Hello");
	}
}
