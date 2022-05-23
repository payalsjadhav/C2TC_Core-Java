package com.Practice;

//Abstract class:-
//A class which contains the abstract keyword in its declaration is called abstract class

//we can't create object for abstract class
//It may or may not contain abstract method
//It can have abstract & non- abstract methods
//To use an abstract class you have to inherite it from sub classes
//If a class contain partial implementation then we should declare a class as abstract.
//Action same and implementation different then use abstract Method

/*Syntax:-
abstract class A
{
	
}
*/

public class AbDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaheshPhone obj = new PiyaPhone();//cannot instantiate the abstract class
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();

	}

}

abstract class MaheshPhone{    //Abstract class
	public void call()
	{
		System.out.println("Calling...");
		
	}
	public abstract void move();//Abstract Methods
	public abstract void dance();
	public abstract void cook();
}
abstract class PayalPhone extends MaheshPhone 
{
	public void move() {
		System.out.println("Moving...");
		
	}
}

class PiyaPhone extends PayalPhone//concreate class
{
	public void dance()
	{
		System.out.println("Dancing...");
	}
	public void cook()
	{
		System.out.println("Coocking...");
	}
}