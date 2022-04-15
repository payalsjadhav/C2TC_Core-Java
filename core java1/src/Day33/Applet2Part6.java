package Day33;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Applet2Part6 extends Applet
{
	Button b1,b2;
	TextField t;
	public Applet2Part6() {
		
	}
	public void init() 
	{
		add(b1=new Button("click"));
		add(t = new TextField(15));
		add(b2=new Button("Clear"));
		
		b1.addActionListener(new H(this));
		b2.addActionListener(new I(this));
		
	}

}
class H implements ActionListener
{//outre class
	
	Applet2Part6 ap;
	
	H(Applet2Part6 ap){
		
		this.ap=ap;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		ap.t.setText("Hello World");
	}
}
class I implements ActionListener//outer class
{
	Applet2Part6 ap;
	
	I(Applet2Part6 ap){
		
		this.ap=ap;
	}
	
	public void actionPerformed(ActionEvent e) {
		ap.t.setText(" ");
	}
}
