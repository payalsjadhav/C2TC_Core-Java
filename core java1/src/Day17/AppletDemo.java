package Day17;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.Button;

public class AppletDemo extends Applet
{
	Button b;
	TextField t;
	
	public void init()
	{
		//
		TextField t = new TextField(25);
		Button b = new Button("Submit");
		
		//
		add(t);
		add(b);
	}

}
