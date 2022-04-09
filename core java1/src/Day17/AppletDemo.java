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
		Button b = new Button();
			
	   TextField t = new TextField();
	   b.setLabel("Submit");
		
		//
		add(t);
		add(b);
	}

}
