package thread;

public class NameThreadEx {
	public static void main(String[] args) {
		Thread mainTh= Thread.currentThread();
		System.out.println(mainTh.getName());
		//메인의 스레드
		
		Thread thread1 = new NameMovieThread();
		System.out.println(thread1.getName());
		thread1.start();

		Thread thread2 = new Thread(new NameMusicRunnable());
		thread2.setName("Music");
		//생성자를 여기서 줄 수 있다.
		thread2.start();

		Thread thread3 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println(this.getName());

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		};
		thread3.getName();
		thread3.start();
	}
}
