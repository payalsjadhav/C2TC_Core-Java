package Day32;

import java.applet.Applet;

public class Applet2Part1 extends Applet implements ActionListener 
{
	Button b1,b2;
	Textfield t;
	public void main()
	{
		add(b1=new button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addActionListener(this);
		b2.addActionListner(this);
	}
	public void actionPerformed(ActionEvent e) {
		Object o = getsource();
		
	}

}
