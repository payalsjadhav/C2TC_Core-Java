package Day30;

public class Demo1 {

}
interface A {
	public default void m1() {
		System.out.println("Hello");
	}
	
}
interface B extends A {
	public default void m1() {
		System.out.println("Hello Everyone");
	}
	
}
interface C extends A {
	public default void m1() {
		System.out.println("Hello Studends");
	}
	
}
interface D extends B,C {
	public default void m1() {
		B.super.m1();
	}
	
}
