package Day50;

class Multithread12
{
	public void printCount()
	{
		try
		{
			for(int i=5;i<0;i--)
			{
				System.out.println("Counter---"+i);
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
	}
}
class Thread15 extends Multithread
{
	private Thread t;
	private String threadName;
	Multithread MT;
	Thread15(String name,Multithread mt)
	{
		threadName = name;
		MT=mt;
	}
	
	
	{
	synchronoized(MT);
	{
		MT.printCount();
	}
	System.out.println("Thread"+ threadName+ "exiting");
		
	}
	public void start()
	{
		
		System.out.println("Starting"+ threadName);
		
		
		if(t==null)
		{
			t=new Thread(threadName,this);
			t.start();
		}
	}
	private void synchronoized(Multithread mT2) {
		// TODO Auto-generated method stub
		
	}
	
	

		}
public class TestThreadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithread MT=new Multithread();
		Thread T =new Thread("Thread-1",MT);
		Thread T1=new Thread("Thread-2",MT);
		T.start();
		T1.start();
	
			}

		}
	

