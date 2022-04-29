package Day50;

class Multithread2
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
class Thread1 extends Multithread2
{
	 Thread t;
	private String threadName;
	Multithread2 MT;
	Thread1(String name,Multithread2 mt)
	{
		threadName = name;
		MT=mt;
	}
	public void run()
	{
		MT.printCount();
		System.out.println("Thread"+ threadName+ "exiting");
		
	}
	public void start()
	{
		System.out.println("Starting"+ threadName);
		if(t==null)
		{
			t=new Thread(this);
			t.start();
		}
	}
}

public class TestThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multithread MT=new Multithread();
Thread t=new Thread("Thread-1",MT);
Thread t1=new Thread("Thread-2",MT);
t.start();
t1.start();
try
{
	 t.join();
	t1.join();
}
catch(Exception e)
{
	System.out.println("interrupted");
}
	}

}


