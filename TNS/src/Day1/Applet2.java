package Day1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet2 extends Applet {
	
	Button b;
	TextField t;
	
	public void init() {
		
		Button b = new Button();
		TextField t = new TextField();
		b.setLabel("Submit");
		
		add(b);
		add(t);
		
	}

}
