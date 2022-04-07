package Day32;

import java. applet.applet;
import java.awt.TextField;
import java.awt.event.actionEvent;
import java.awt.event.ActionListner;

public class Applet2Part4 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addactionListener[(ActionListner e>-> [t.setText("Hello World");]);
		//b1.addActionListner [(e)-> [t.setText ("Hello World");)];
		//b2.addActionListner [(e)-> [t.setText ("Hello World");)];
		b2.addActionListner[(e)-> t.setText("");
	}
}
