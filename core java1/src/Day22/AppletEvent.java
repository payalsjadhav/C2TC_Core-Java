package Day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Event; //importing Event class of awt package
import java.awt.TextField;


public class AppletEvent extends Applet
{
	Button b1,b2;
	TextField t;
	
	public void init()
	{
		b1=new Button("Click");
		t=new TextField(10);
		b2 =new Button("clear");
		add(b1);
		add(t);
		add(b2);
		setSize(300,100);
		
	}
	public boolean action(Event e,Object o)
	{
		if(e.target.equals(b1))
			t.setText("");
		if(e.target.equals(b2))
			t.setText("");
		
		return true;
		
	}

}
