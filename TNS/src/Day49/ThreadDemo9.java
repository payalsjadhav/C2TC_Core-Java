package Day49;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo9 extends Frame implements Runnable 
{
	Thread th1;
	Thread th2;
	TextField t12,t2;
	int i,j;
	public ThreadDemo9()
	{
		setLayout(new FlowLayout());
		add(t12 = new TextField(15));
		add(t2 = new TextField(15));
		th1 = new Thread(this);
		th2 = new Thread(this);
		th1.start();
		th2.start();
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
				});
				setSize(300,300);
				setVisible(true);
	}
public static void main(String[] args) {
	
new ThreadDemo9();
	}
@Override
public void run()
{
	//TODO Auto-generated method stub
while(true)
{
	Thread th = Thread.currentThread();
	if(th.equals(th1))
	{
		t12.setText(String.valueOf(i));
		if(i==100)
			i=0;
		else
			i++;
		
	}
	if(th.equals(th2))
	{
		t2.setText(String.valueOf(j));
		if(j==100)
			j=0;
		else
			j++;	
	}
	
}
	

	}

}


