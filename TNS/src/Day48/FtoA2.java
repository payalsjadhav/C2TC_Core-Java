package Day48;

import java.applet.Applet;
import java.awt.TextField;

public class FtoA2 extends Applet
{
	TextField t1,t2;
	int i,j;
	public void init()
	{
		
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		
		C c=new C(null);
		D d=new D(null);
		
		c.start();
		d.start();
		}
	
class C extends Thread
{
	FtoA2 thf1;
	C(FtoA2 thf1)
	{
		this.thf1=thf1;
	}
	
	public void run()
	{
		while(true)
		{
			thf1.t1.setText(String.valueOf(thf1.i));
			if(thf1.i==100)
				thf1.i=0;
			else
				thf1.i++;
		}
	}
}
class D extends Thread
{
	FtoA2 thf2;
	D(FtoA2 thf2)
	{
		this.thf2=thf2;
	}
	
	public void run()
	{
		while(true)
		{
			thf2.t2.setText(String.valueOf(thf2.j));
			if(thf2.j==100)
				thf2.j=0;
			else
				thf2.j++;
		}
	}
}
}
