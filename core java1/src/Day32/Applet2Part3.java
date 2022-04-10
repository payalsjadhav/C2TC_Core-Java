package Day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part3 extends Applet implements ActionListener
{
	Button b1,b2;
	TextField tf;
	
	public void init()
	{
		add(b1=new Button("Click"));
		add(tf=new TextField(20));
		add(b2=new Button("Clear"));
		//register components button with listener
		b1.addActionListener(this);
		B b=new B(this);
		b2.addActionListener(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Hello, My name is Payal Jadhav.");
	}

}
class B implements ActionListener
{
	Applet2Part3 al;
	
	B(Applet2Part3 al)
	{
		this.al = al;
	}
	public void actionPerformed(ActionEvent arg0)
	{
		al.tf.setText(" ");
	}
}
