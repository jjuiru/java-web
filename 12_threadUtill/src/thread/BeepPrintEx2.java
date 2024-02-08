package thread;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		Thread th =new Thread(new BeepTask());
		th.start(); // 동시에 실행된다.
	
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");

			try {
				Thread.sleep(500); // 잠시 멈춤 0.5초
			} catch (InterruptedException e) {
//			e.printStackTrace();
			}
		}
		System.out.println("띵종료");
		System.out.println("메인종료");
	}
}
