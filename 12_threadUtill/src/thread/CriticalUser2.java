package thread;

public class CriticalUser2 extends Thread {

	private CriticalCalculator calculator;
	
	
	public void setCalculator(CriticalCalculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(50);
	}
}