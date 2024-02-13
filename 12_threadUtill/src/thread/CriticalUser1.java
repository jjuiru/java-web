package thread;

public class CriticalUser1 extends Thread {

	private CriticalCalculator calculator;
	
	
	public void setCalculator(CriticalCalculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
