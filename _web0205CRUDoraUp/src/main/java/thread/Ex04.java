package thread;

public class Ex04 {
	public static void main(String[] args) {
		WorkerThread wt= new WorkerThread();
		wt.start();
		mainTask();
	}
	public static void mainTask(){
		System.out.println("시작");
		for (int i = 0; i < 5; i++) {
			System.out.println("Task 진행");
			try {
				Thread.sleep(500); // 1000=1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        System.err.println("Task끝");
	}
}
