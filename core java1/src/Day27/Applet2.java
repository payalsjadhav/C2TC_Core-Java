package Day27;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class Applet2 extends Applet
{
	Button b1,b2;
	TextField tf;
	public void init() {
		//b1= new Button("Click");
		//t = new Textfield(5);
		add(b1=new Button("Click"));
		add(tf=new TextField(5));
		add(b2=new Button("Clear"));
		
	}
	
     public boolean ActionListener (Event e, Object o)
	{
		if(e.target.equals(b1))
			tf.setText("Hello");
		if(e.target.equals(b2));
		tf.setText("");
		
		return true;
	}

}
