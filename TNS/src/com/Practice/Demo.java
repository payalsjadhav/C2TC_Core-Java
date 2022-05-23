package com.Practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello World");
		
		myclass obj1 = new myclass();//object  created
		myclass obj2 = new myclass();
		myclass obj3 = new myclass();
		System.out.println(obj1.i);
		System.out.println(obj2.i);
		
		System.out.println(obj3.name);
		
		

	}

}
class myclass{
int i = 1;

String name = "Payal";
}

