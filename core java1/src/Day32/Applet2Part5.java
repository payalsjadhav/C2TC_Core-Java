package Day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part5 extends Applet
{
	Button b1,b2;//Declaration area
	TextField t;
	
	public void init() {
		add(b1=new Button("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener((e)-> t.setText("Hello World"));
		
		/*b1.addActionListner [(e)-> [t.setText ("Hello World");)];
		b2.addActionListner [(e)-> [t.setText ("Hello World");)];*/
		
		b2.addActionListener((e)->t.setText(" "));
	}
}
