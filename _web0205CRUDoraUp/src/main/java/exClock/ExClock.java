package exClock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExClock extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			LocalDateTime localDateTime = LocalDateTime.now();
			String localDateTimeFormat1 = localDateTime
					.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
			System.out.println(localDateTimeFormat1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


