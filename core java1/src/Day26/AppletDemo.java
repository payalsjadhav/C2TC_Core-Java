package Day26;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Component;


public class AppletDemo extends Applet 
{
	Button b;
	TextField t;
	Component c;
	
	public void init()
	{
		TextField t = new TextField(25);
		Button b = new Button("Submit");
		Component c = new Component();
		//In Abstract class Object is not Created in this code
		
		add(t);
		add(b);
		setSize(400,100);
	}
}
