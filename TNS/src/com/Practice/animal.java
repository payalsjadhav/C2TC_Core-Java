package com.Practice;

abstract class animal {
	animal()
	{
		System.out.println("All animals....!");
	}
	public abstract void sound();

}
class dog extends animal
{
	
	dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sound()
	{
		System.out.println("Dog is Barking");
	}
	
	
}
class Lion extends animal
{
	
	Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sound()
	{
		System.out.println("Lion is Roar");
	}
	
}
