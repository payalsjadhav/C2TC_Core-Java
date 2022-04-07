package Day32;

import java. applet.applet;
import java.awt.TextField;

public class Applet2Part4 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1=new button("click"));
		add(t=new TextField(15));
		add(b2=new Button("clear"));
		b1.addactionListener (new ActionListner() {
			public void actionPerformed (ActionListner e) {
				t.setText("Hello World");
			}
		});
		b2.addactionListner(new ActioListner () {
			public void actionPerformed (ActionListner e) {
				t.setText("");
			
		}
	}
	}
	//class A implements actionPerformed(ActionListner) {
		public void actionPerformed(ActionEvent e) {
			t.setText("Hello World");
	}
	}
		class B implements ActionListner{
			public void actionPerformed(ActionEvent e) {
				t.setText("");
		}
			
		}//

}
	