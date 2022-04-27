package Day44;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ThreadDemo6 extends Frame {
	TextField t1,t2;
	Thread  th1,th2;
	int i,j;
	public ThreadDemo6() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			
		}
		});
	
	setSize(40,400);
	setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo6();

	}
	public void run() {
		while(true) {
			Thread th = Thread.currentThread();
			if(th.equals(th1)) {
				t1.setText(String.valueOf(i));
				if(i==100)
					i=0;
				else
					i++;
			}
			if(th.equals(th2)) {
				t2.setText(String.valueOf(j));
				if(j==100)
					j=0;
				else
					j++;
			}
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				
			}
		}
	}
}
