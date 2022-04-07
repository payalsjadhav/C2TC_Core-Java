package Day32;

public class InnerclassDemo {
	int i;
	static int j;//static variable
	class A{
		public void m1() {//son static method
			i=10;
		}
		
	}
	static class B{//static class/Nested types
		public void m2() {
			i =10;
			j =10
		}
		
	}

}
//public class//only once
