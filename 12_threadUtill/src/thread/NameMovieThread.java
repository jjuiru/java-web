package thread;

public class NameMovieThread extends Thread {
	
	public NameMovieThread() {
		this.setName("Movie");
	}

	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
