package Day32;

import java. applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part4 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addActionListener (new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				t.setText("Hello World");
			}
		});
		b2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				t.setText("");
			}
		});
	}
}
			
	
	
	/*class A implements actionPerformed(ActionListner) {
		public void actionPerformed(ActionEvent e) {
			t.setText("Hello World");
	}
	}
		class B implements ActionListner{
			public void actionPerformed(ActionEvent e) {
				t.setText("");
		}
			
		}//

}
	*/