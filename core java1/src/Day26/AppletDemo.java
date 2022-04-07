package Day26;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Components;


public class AppletDemo extends Applet 
{
	Button btn;
	TextField tf;
	Component cm;
	
	public void init()
	{
		TextField tf = new TextField(25);
		Button btn = new Button("Submit");
		Component cm = new Component();
		
		add(tf);
		add(btn);
		setSize(400,100);
	}

}
