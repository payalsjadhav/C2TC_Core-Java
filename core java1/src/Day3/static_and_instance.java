package Day3;

public class static_and_instance {
	
	static int b=50;//static
	int a=20;//instancr variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=10;//local variables
		static_and_instance ref= new static_and_instance();//instatiation for accesiing the instance variable
		System.out.println(c);
		System.out.println(static_and_instance.b);
		System.out.println(ref.a);

	}

}
