package thread;

public class CriticalMain {

	public static void main(String[] args) {
		CriticalCalculator cal= new CriticalCalculator();
		CriticalUser1 user1= new CriticalUser1();
		user1.setCalculator(cal);
		user1.start();
		
		CriticalUser2 user2= new CriticalUser2();
		user2.setCalculator(cal);
		user2.start();

	}
}
