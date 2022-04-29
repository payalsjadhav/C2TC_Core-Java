package Day49;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrameP4 extends Frame
{
	TextField t1,t2;
	Thread th1,th2;
	int i,j;
	public ThreadFrameP4()
	{
		setLayout(new FlowLayout());
		add(t1=new TextField(20));
		add(t2=new TextField(20));
		
		th1 = new Thread();
		th2 = new Thread();
			addWindowListener(new WindowAdapter() 
			{
				
				public void windowClosing(WindowEvent e)
				{
					
						System.exit(0);
					}
				});
			setSize(300, 300);
			setVisible(true);
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
				}
			}
			}

			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ThreadFrameP4();
	}

}
	

