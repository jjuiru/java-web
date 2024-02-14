package thread;

public class SleepStopFlageEx {

	public static void main(String[] args) {
//		 1 싱글스레드 제어
		SleepStopPrintThread print = new SleepStopPrintThread();
		print.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       print.setStop(true);// 쉬는동안 멈추게 한다.
       // 2멀티스레드 제어
       SleepStopPrintThread2 print2 = new SleepStopPrintThread2();
       print2.start();
       print2.interrupt();// thraed2가 sleep하는 순간에 interrupt 메소드를 실행시켜
       //메인 메소드 슬립시간이 끝나면 메인스레드가 실행되던것이 끝나고 바로 종료시킨다.
       
       // 3멀티스레드 제어
       SleepStopPrintThread3 print3 = new SleepStopPrintThread3();
       print3.start();
       try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       Thread.interrupted();
	}

}
