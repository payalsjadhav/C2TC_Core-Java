package Day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Event; //importing Event class of awt package
import java.awt.TextField;


public class AppletEvent extends applet
{
	Button btn1,btn2;
	TextField tf;
	
	public void init()
	{
		btn1=new Button("Click");
		tf=new TextField(10);
		btn2 =new Button("clear");
		add(btn1);
		add(tf);
		add(btn2);
		setSize(300,100);
		
	}
	public boolean action(Event e,Object o)
	{
		if(e.target.equals(btn1))
			tf.setText("");
		if(e.target.equals(obtn2))
			tf.setText("");
		
		return true;
		
	}

}
