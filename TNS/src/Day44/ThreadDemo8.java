package Day44;

public class ThreadDemo8 implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadDemo8(), "Thread 3");
		t.start();
		System.out.println(t.getName());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Thread");
	}

}
