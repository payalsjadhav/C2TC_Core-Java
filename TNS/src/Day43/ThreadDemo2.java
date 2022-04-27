package Day43;

public class ThreadDemo2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadDemo1 th = new ThreadDemo1();
				//Thread t = new Thread(th);
				Thread t = new Thread (new ThreadDemo2());
				t.start();
				System.out.println(t.getName());
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Payal");
	}
}
