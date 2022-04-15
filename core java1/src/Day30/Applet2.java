package Day30;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.EventListener;
import java.awt.event.ActionListener;

public class Applet2 extends Applet
{
	final int i = 20;
	public final void init() {
		
	}

}
public interface ActionListener extends EventListener 
{
	public abstract void actionPerformed(ActionEvent e);
}
interface A {
	public default void m1() {
		System.out.println("Hello");
	}
	
}
interface B {
	
}
interface C {
	
}
interface D {
	
}