package Day30;

import java.applet.Applet;
import java.awt.event.ActionEvent;

public class Applet6 extends Applet {
	
	final int i = 10;
	public final void init() {
		
	}

}
public interface ActionListener extends EventListener {
	public abstract void ActionPerformed (ActionEvent e);
}
interface A
{
	public default void m1()
	{
		System.out.println("Hello");
	}
}
interface B extends A
{
	public default void m1()
	{
		System.out.println("Hi.....");
	}
}
interface C extends A
{
	public default void m1()
	{
		System.out.println("Good Night....");
	}
}
interface D extends B,C {
	public default void m1() {
		B.super.m1();
	}
	
}

