package Day37;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemo2 extends Frame {
	int[] x;
	int[] y;
	int i;
	public ArrayDemo2() {
		x = new int[7];
		y = new int[7];
		for(int i =0;i<x.length;i++) {
			x[i] = (int)(400*Math.random());
			y[i] = (int)(400*Math.random());
			}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300,400);
		setVisible(true);
		
	}
	public void paint(Graphics g) {
		g.drawPolygon(x,y,5);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayDemo2();
		
	}
}
/*drawploygon -> Graphics
Applet/Frame -> Paint()
init()
start()stop()destroy()*/
