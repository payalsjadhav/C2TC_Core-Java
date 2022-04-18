package com.applet;

import java.applet.*;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;

public class Applet0 extends Applet {
	Button b; //Declaration Area
	TextField t;
	Label l;
	public void init() { //initialization
		b = new Button("SUBMIT"); //instantiating
		t = new TextField(0);
		l = new Label("Hello");
		add(b);//method called
		add(t);//method called
		add(l);//method called
	}
	

}
