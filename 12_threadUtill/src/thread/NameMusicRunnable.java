package thread;

public class NameMusicRunnable implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println("이름을 정할 수 없습니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

