package Day38;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class ArrayDemo2 extends Frame {
	Button[] [] b;
	public ArrayDemo2() {
		setLayout(new GridLayout(3,3));
		b = new Button[3][3];
		for(i = 0;i<b.length;i++) {
			for(j =0;j<b[i].length;j++) 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayDemo2();

	}

}
