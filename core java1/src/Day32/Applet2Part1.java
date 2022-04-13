package Day32;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part1 extends Applet implements ActionListener 
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new Button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object O = e.getSource();
		if(O.equals(b1));
		t.setText("Hello World");
		if(O.equals(b2));
		t.setText("");
		
	}

}
