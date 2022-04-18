package Day40;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemo2 extends Frame{
	Button[] [] b;
	public ArrayDemo2() {
		setLayout(new GridLayout(3,3));
		b = new Button[3][3];
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
				if(Math.random()<0.5) 
					add(b[i][j] = new Button("x"));
					else
						add(b[i][j] = new Button("o"));
				}
			}
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
					
				}
				
			});
			setSize(400,400);
			setVisible(true);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayDemo2();
	}
}
