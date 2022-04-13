package Day36;

class N{
	
}

public class ArrayDemo {
	//int[] i; //intager Array
	//i = new int[10];
	int j[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o;
		o = 10;
		o = 2.5;
		int i;
		//i = 2.5;
		Object o1 = new Object();
		//o1 = new ArrayDemo();
		ArrayDemo ad = new ArrayDemo();
		Object o2[];
		o2 = new Object[5];
		o2[0] = new ArrayDemo();
		o2[1] = new N();
		o2[2] = new Integer(10);
		o2[3] = 10;
	}

}
/*Array of int
Object o[]; //Array of Object
o = new Object[5];//initialize array of onject
Button b[];
b = new Button[5]; //initialize Array of Button
o=b;
Object o = new Object(); //Object is super class
Button b= new Button(); //Button is sub class
Object o = new Button();
Object o = 10;*/