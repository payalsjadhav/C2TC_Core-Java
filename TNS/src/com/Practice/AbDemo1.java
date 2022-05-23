package com.Practice;

public class AbDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone obj = new IPhone();
		Samsung54 obj1 = new Samsung54();
		show(obj);

	}
	public static void show(IPhone obj)
	{
		obj.showConfig();
	}
	public static void show(Samsung54 obj)
	{
		obj.showConfig();
	}

}

abstract class Phone
{
	public abstract void showConfig();
}

class IPhone
{
	public void showConfig()
	{
		System.out.println("2 Gb ,IOS 9.3");
		
	}
}
class Samsung54
{
	public void showConfig()
	{
		System.out.println("2 Gb,Lolipop");
	}
}
