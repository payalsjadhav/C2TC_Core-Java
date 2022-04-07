package Day4;


public class StaicInstanceDemo {
	static int b=50;//static
	int a=20;//instancr variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=10;//local variables
		StaicInstanceDemo ref= new StaicInstanceDemo();//instatiation for accesiing the instance variable
		System.out.println(c);
		System.out.println(StaicInstanceDemo.b);
		System.out.println(ref.a);
	}
}
