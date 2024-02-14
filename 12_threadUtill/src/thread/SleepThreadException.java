package thread;

public class SleepThreadException {

	public static void main(String[] args) {
		// 스레드를 따로 만들지 않으면 싱글스레드로 진행
		for (int i=0; i<3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// 대기상태로 종료할지 다시 실행할지를 결정한다.
				e.printStackTrace();
			}
		}
	}
}
