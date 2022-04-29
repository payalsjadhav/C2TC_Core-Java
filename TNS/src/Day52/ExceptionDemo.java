package Day52;

public class ExceptionDemo {
	public void m1() throws Exception {
		
	}
}
	class Qt{
		public void m2() throws Exception {
			ExceptionDemo ed = new ExceptionDemo();
			ed.m1();
			//throws new ExceptionDemo();
			
		}
	}
