package Day9;

class Animal{
	void eat()
	{
		System.out.println("Eating..");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking..");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping..");
	}
}
public class MultilevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog bd= new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();

	}

}
