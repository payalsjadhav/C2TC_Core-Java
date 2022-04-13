package Day35;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIApp1  extends Frame 
{
	Button b1,b2;//components
	TextField t;
	public GUIApp1() {//initialization
		setLayout(new FlowLayout());
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Clear"));
		b1.addActionListener((e) -> t.setText("Hello World"));//Lambda Expretion
		b2.addActionListener((e) -> t.setText(""));
		addWindowListener(new WindowAdapter() //created for application
				{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
				});
		setSize(400,500);
		setVisible(true); //check visibility
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIApp1();

	}

}
