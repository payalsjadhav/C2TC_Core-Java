package Day48;

import java.applet.Applet;
import java.awt.TextField;

public class FtoA1 extends Applet 
{
	TextField t1,t2;
	Thread th1;
	int i,j;

public void init()
{
	add(t1 = new TextField(15));
	add(t2 = new TextField(15));
	
	th1 = new Thread();
	A a = new A();
	
	th1.start();
	a.start();
	}
public void run()
{
	while(true)
	{
		t1.setText(String.valueOf(i));
		if(i==100)
			i=0;
		else
			i++;
		
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			//TODO handle Exception
		}
	}
}
class A extends Thread
{
	public void run()
	{
		while(true)
		{
			t2.setText(String.valueOf(j));
			
			if(j == 100)
				j = 0;
			else
				j++;
			
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				//TODO handle exception
			}
		}
	}
}
}




