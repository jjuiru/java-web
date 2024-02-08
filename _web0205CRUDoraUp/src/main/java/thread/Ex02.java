package thread;

public class Ex02 {

	public static void main (String[]args){
		Task task =new Task();
		Thread th=new Thread(task);
		//객체생성한 것을 thread에 넣는다. 
		th.start(); //run을 바로 start하지 않는다. 
		mainTask();// task 메소드를 실행해 thread와 동시진행
	}
	public static void mainTask() {
		System.out.println("Task 시작");
		for (int i = 0; i < 5; i++) {
			System.out.println("Task 진행");
			try {
				Thread.sleep(500); // 1000=1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.err.println("끝");
	}
}
