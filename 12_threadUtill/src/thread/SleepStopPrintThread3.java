package thread;

public class SleepStopPrintThread3 extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("3실행 중");
			if (Thread.interrupted()) { // 오류발생시
				break; // 브레이크로 무한반복 빠져나감
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
