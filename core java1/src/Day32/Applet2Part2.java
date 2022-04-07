package Day32;

import java.applet.Applet;

public class Applet2Part2  extends Applet implements ActionListener
{
	Button b1,b2;
	Textfield t;
	public void init()//override
	add(b1=new button("click"));
	add(t=new TextField(15));
	add(b2=new Button("clear"));
	b1.addActionListener(this);
	b2.addActionListner(this);
	A a =new A();
	//b2.addActionListner(new A());

}
public void actionPerformed(ActionEvent argo) {
	t.settext("Hello World");
}
class A implements ActionListner{
	public A() {
		b2.addActionListner();
	}
public void actionPerformed(ActionEvent e) {
	t.setText("");
	
}
}
}
