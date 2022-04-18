package Day39;

public class NarrowingTypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 666.66;
		//Converting double data type into long data type
		long l = (long)d;
		//Converting long data type into int data type
		int i =(int)l;
		System.out.println("Before conversion:"+d);
		//fractional part lost
		System.out.println("After conversion into long type:"+l);
		System.out.println("After conversion into long type:"+i);

	}

}
