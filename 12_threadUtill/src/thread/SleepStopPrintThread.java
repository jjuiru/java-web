package thread;

public class SleepStopPrintThread extends Thread {
	private boolean stop; // 기본값false
 
	public void setStop(boolean stop) { // true로 바꾸면 멈춘다.
		this.stop = stop;
	}

	@Override
	public void run() { // 무한반복 실행된다.
		while (!stop) {
			System.out.println("실행중");
		}
System.out.println("자원 정리");
System.out.println("실행 종료");
	}
}
