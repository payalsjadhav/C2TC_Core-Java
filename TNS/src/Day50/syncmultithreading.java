package Day50;

class Sender
{
	public void SenderMsg(String msg)
	{
		System.out.println("\nsending a message: " + msg);
		try
		{
			Thread.sleep(800);
		}
		catch(Exception e)
		{
			System.out.println("thread interrupted");
		}
		System.out.println("\n" +msg+ "sent");
	}
}
class SenderWThreads extends Thread
{
	private String msg;
	Sender sd;
	SenderWThreads(String m,Sender obj)
	{
		msg = m;
		sd = obj;
	}
	public void run()
	{
		synchronized(sd)
		{
			sd.SenderMsg(msg);
		}
	}
}
public class syncmultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sender sender = new Sender();
SenderWThreads1 sender1 = new SenderWThreads("hello");
SenderWThreads2 sender2 = new SenderWThreads("ways");
sender1.join();
sender2.start();
try
{
	sender1.joint();
	sender2.joint();
}
catch(Exception e)
{
	System.out.println("interrupted");
}
	}

}


