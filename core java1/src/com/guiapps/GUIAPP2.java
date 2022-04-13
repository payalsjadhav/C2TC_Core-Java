package com.guiapps;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;

public class GUIAPP2 extends Frame {
	Button b1,b2;//components
	TextField t;
	public GUIAPP2() {//initialization
		add(b1 = new Button("Click"));
		add(t = new TextField(15));
		add(b2 = new Button("Click"));
		
		b1.addActionListener((e) -> t.setText("Hello World"));//Lambda Expretion
		b2.addActionListener((e) -> t.setText(""));
		
		addWindowListener(new WindowAdapter()
				{
			
				});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
