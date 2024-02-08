package thread;

public class BeepTask implements Runnable {
	//스레드 만드는 과정

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");

			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {
//			e.printStackTrace();
			}
		}
		System.out.println("beep종료");
	}
}
