package classEx;

public class ClassMethodPower {
	public static void main(String[] args) {
		ClassMethodPowerEx power = new ClassMethodPowerEx();
		power.powerOn();

		int result1 = power.plus(5, 6);
		System.out.println("result1 :" + result1);

		byte x = 10;
		byte y = 4;
		double result2 = power.divide(x, y);
		System.out.println("result2 :" + result2);
		
		power.powerOn();
	}
}
