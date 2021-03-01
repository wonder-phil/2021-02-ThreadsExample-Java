package example2;

public class TestThread2 {
	
	private static int a = 10;
	private static int b = -9;
	
	public static void main(String[] args) throws InterruptedException {
		
		Share share = new Share(3);
		
		Thread thread_A = new ThreadExtension(share,"Thread_A");
		Thread thread_B = new ThreadExtension(share,"Thread_B");
		
		
		
		thread_A.start();
		thread_B.start();
		
		System.out.print("1 a: "+ String.valueOf(a).toString() + "\n");
		System.out.print("1 b: "+ String.valueOf(b).toString() + "\n");
		
		thread_A.join();
		thread_B.join();
	
		System.out.print("shared secret: " + share.getSecret());
	}
	
	public static void my_methdod() {
		a = a+5;
		b = b+5;
	}
}
