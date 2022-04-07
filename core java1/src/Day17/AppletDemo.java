package Day17;

import java.applet.Applet;
import java.awt.TextField;
import java.awt.Button;

public class AppletDemo extends Applet
{
	Button btn;
	TextField tf;
	
	public void init()
	{
		//
		TextField tf = new TextField(25);
		Button btn = new Button("Submit");
		
		//
		add(tf);
		add(btn);
	}

}
