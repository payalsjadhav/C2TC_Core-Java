package Day32;

public class InnerclassDemo {
	static int i;
	static int j;//static variable
	class A{
		public void m1() {//non static method
			i=10;
		}
		
	}
	static class B{//static class/Nested types
		public void m2() {
			i = 10;
			j = 10;
		}
		
	}

}
//public class//only once
