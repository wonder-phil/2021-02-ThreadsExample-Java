package example2;

public class ThreadExtension extends Thread {
	
	Share share;
	
	public ThreadExtension(Share share, String t_name) {
		this.setName(t_name);
		this.share = share;
	}
	
	@Override
	public void run() {
		share.x += 5;
		share.y += 5;
		int s = share.getSecret();
		if (this.getName() == "Thread_A") {
			share.setSecret(s+10);
		} else {
			share.setSecret(s+100);
		}
	}
}
