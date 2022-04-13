package com.AppletDay35;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMotion extends Applet {
	public void init()
	{
		//add(b) = new Button("Click"))
		//b.addActionListener()
		addMouseMotionListener(new MouseMotionAdapter() {
			//@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				//String i = String.valueOf(x);
				//String j = String.valueOf(y);
				//showStatus(i+ ","+ j);
				showStatus(String.valueOf(x)+","+ String.valueOf(y));
			}
		});
		
	}
	

}
