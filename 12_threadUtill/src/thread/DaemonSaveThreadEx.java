package thread;

public class DaemonSaveThreadEx {

	public static void main(String[] args) {
		DaemonSaveThread daemon = new DaemonSaveThread();
		daemon.setDaemon(true);
		daemon.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인 스레드 종료");
	}
}
